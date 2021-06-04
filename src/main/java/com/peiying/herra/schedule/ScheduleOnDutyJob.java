package com.peiying.herra.schedule;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.peiying.herra.common.constants.DutyStatusCode;
import com.peiying.herra.common.constants.DutyTypeCode;
import com.peiying.herra.common.utils.DateTimeUtil;
import com.peiying.herra.po.SgOnDutyConfig;
import com.peiying.herra.po.SgOnDutyInfo;
import com.peiying.herra.service.base.SgOnDutyConfigBaseService;
import com.peiying.herra.service.base.SgOnDutyInfoBaseService;

@Component
public class ScheduleOnDutyJob {
	@Autowired
	private SgOnDutyConfigBaseService sgOnDutyConfigBaseService;
	@Autowired
	private SgOnDutyInfoBaseService sgOnDutyInfoBaseService;

	@Scheduled(cron = "0 0 0 * * ?")
	public void scheduleOnDuty() {
		int nowWeek = DateTimeUtil.getNowWeek();
		List<SgOnDutyConfig> selectAll = sgOnDutyConfigBaseService.selectAll();
		if (null == selectAll) {
			return;
		}
		selectAll.forEach((a) -> {
			String dutysequence = a.getDutysequence();
			if (dutysequence == null || dutysequence.length() <= 0) {
				return;
			}
			String[] dutyArray = dutysequence.split(",");
			int nextNDay = 0;
			if (a.getDutytype() == DutyTypeCode.SEVEN_DAY_PER) {
				if (a.getDutyswitchtype() != nowWeek) {
					return;
				}
				nextNDay = 7;
			}
			if (a.getDutytype() == DutyTypeCode.ONE_DAY_PER) {
				nextNDay = 1;
			}
			SgOnDutyInfo selectOnCallUserBySgId = sgOnDutyInfoBaseService.selectOnCallUserBySgId(a.getSgid());
			selectOnCallUserBySgId.setCurrentdutystarttime(
					DateTimeUtil.getNextNDay(DateTimeUtil.getZeroDate(new Date()), dutyArray.length - 1));
			selectOnCallUserBySgId.setCurrentdutyendtime(
					DateTimeUtil.getNextNDay(selectOnCallUserBySgId.getCurrentdutystarttime(), nextNDay));
			selectOnCallUserBySgId.setDutystatus(DutyStatusCode.OFFLINE);
			selectOnCallUserBySgId.setUpdateby("ScheduleOnDutyJob#scheduleOnDuty");
			selectOnCallUserBySgId.setUpdatetime(new Date());
			int binarySearch = Arrays.binarySearch(dutyArray, selectOnCallUserBySgId.getUserno());
			String newOnDutyUser = null;
			if (binarySearch == dutyArray.length - 1) {
				newOnDutyUser = dutyArray[0];
			} else {
				newOnDutyUser = dutyArray[binarySearch + 1];
			}
			SgOnDutyInfo newOnDuty = sgOnDutyInfoBaseService.selectBySgIdAndUserNo(a.getSgid(), newOnDutyUser);
			if (newOnDuty == null) {
				return;
			}
			newOnDuty.setDutystatus(DutyStatusCode.ONLINE);
			newOnDuty.setUpdateby("ScheduleOnDutyJob#scheduleOnDuty");
			newOnDuty.setUpdatetime(new Date());
			newOnDuty.setCurrentdutystarttime(DateTimeUtil.getZeroDate(new Date()));
			newOnDuty.setCurrentdutyendtime(DateTimeUtil.getNextNDay(newOnDuty.getCurrentdutystarttime(), nextNDay));
			sgOnDutyInfoBaseService.updateById(newOnDuty, newOnDuty.getId());
			sgOnDutyInfoBaseService.updateById(selectOnCallUserBySgId, selectOnCallUserBySgId.getId());
		});
	}
}
