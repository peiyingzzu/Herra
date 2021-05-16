package com.peiying.herra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peiying.herra.mapper.ConsumeMapper;
import com.peiying.herra.po.Consume;

@RestController
public class HelloController {
	@Autowired
	private ConsumeMapper consumeMapper;
    @RequestMapping("/hello")
 public String hello() {
    	List<Consume> list = consumeMapper.selectAll();
    	if (list == null || list.size() < 0) {
    		return "没有数据";
    	}
    	return list.toString();
 }

}	