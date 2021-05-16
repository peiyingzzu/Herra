package com.peiying.herra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peiying.herra.bo.UserInfoBO;
import com.peiying.herra.mapper.ConsumeMapper;

@RestController
@RequestMapping("/herra/user")
public class UserInfoController {
	@Autowired
	private ConsumeMapper consumeMapper;

	@RequestMapping("/add")
	public ResponseEntity<Boolean> add(@RequestBody UserInfoBO userBO) {
		return null;
	}

}