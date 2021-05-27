package com.peiying.herra.service;

import com.peiying.herra.common.utils.Response;

public interface UserAccountService {
	Response<Boolean> signUp(String userName, String password);

	Response<Boolean> login(String userName, String password);

	Response<Boolean> logout(String userName);
}
