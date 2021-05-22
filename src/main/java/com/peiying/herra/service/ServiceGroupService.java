package com.peiying.herra.service;

import com.peiying.herra.bo.ServerGroupInfoBO;
import com.peiying.herra.common.utils.Response;

public interface ServiceGroupService {
	Response<Boolean> add(ServerGroupInfoBO serverGroupInfoBO);
}
