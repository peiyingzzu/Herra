package com.peiying.herra.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peiying.herra.bo.UserInfoBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.po.UserInfo;
import com.peiying.herra.service.UserInfoService;
import com.peiying.herra.service.base.UserInfoBaseService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoBaseService userInfoBaseService;

	public Response<Boolean> addUser(UserInfoBO userInfoBO) {
		if (userInfoBO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (userInfoBO.getDepid() == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (StringUtils.isAnyEmpty(userInfoBO.getCreateby(), userInfoBO.getName(), userInfoBO.getPhone(),
				userInfoBO.getUserno())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		String phone = userInfoBO.getPhone();
		UserInfo userByUserNO = userInfoBaseService.getUserByPhone(phone);
		if (userByUserNO != null) {
			return ResponseBuilder.fail(CodeConstant.USER_HAS_EXIST,
					"phone is exist, please try with username is " + userByUserNO.getUserno());
		}
		String userNo = userInfoBO.getUserno();
		userByUserNO = userInfoBaseService.getUserByUserNO(userInfoBO.getUserno());
		if (userByUserNO != null) {
			synchronized (this) {
				List<String> sequenceUserNo = userInfoBaseService.getSequenceUserNo(userInfoBO.getUserno());
				Optional<String> userNoMax = sequenceUserNo.stream().max((a, b) -> a.compareTo(b));
				String sequence = userNoMax.get().substring(userNo.length());
				;
				int nexSequence = 0;
				if (sequence.length() == 0) {
					nexSequence = 2;
				} else {
					nexSequence = Integer.parseInt(sequence) + 1;
				}
				return ResponseBuilder.fail(CodeConstant.USER_HAS_EXIST, "UserNo is exist, please try " + userNo + nexSequence);
			}
		}

		boolean addUser = userInfoBaseService.addUser(userInfoBO);
		return ResponseBuilder.success(addUser);
	}

	public Response<UserInfo> getUserByUserNO(String userNO) {
		UserInfo result = userInfoBaseService.getUserByUserNO(userNO);
		return ResponseBuilder.success(result);
	}
}
