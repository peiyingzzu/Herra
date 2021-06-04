package com.peiying.herra.service;

import java.util.List;

import com.peiying.herra.bo.ServerGroupInfoBO;
import com.peiying.herra.bo.SgOnDutyConfigBO;
import com.peiying.herra.common.utils.Response;

public interface ServiceGroupService {

	Response<Boolean> add(ServerGroupInfoBO serverGroupInfoBO);

	Response<Boolean> addUsers(int sgId, List<String> userNoList, String operator);
	
	Response<Boolean> deleteUsers(int sgId, List<String> userNoList, String operator);

	Response<Boolean> addConfigOnDuty(SgOnDutyConfigBO bo);

}
