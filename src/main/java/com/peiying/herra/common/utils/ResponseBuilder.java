package com.peiying.herra.common.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.peiying.herra.common.constants.CodeConstant;

public class ResponseBuilder {
	private static final String SUCCSEE = "success";

	public static <T> Response<T> buildEntity(T data, int code, String msg) {
		Response<T> response = new Response<T>(code, data, SUCCSEE);
		return response;
	}

	public static <T> Response<T> success(T data) {
		Response<T> response = new Response<T>(CodeConstant.SUCCSEE, data, SUCCSEE);
		return response;
	}

	public static <T> Response<T> fail(int code, String msg) {
		Response<T> response = new Response<T>(code, null, msg);
		return response;
	}
}
