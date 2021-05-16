package com.peiying.herra.service;

import com.peiying.herra.common.utils.Response;

public interface UserAccountService {
	Response<Boolean> logup(String userName, String password);

	Response<Boolean> login(String userName, String password);
}
