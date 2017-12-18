package com.dp.petshome.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dp.petshome.service.DubboDemoService;

@Service
public class DubboDemoServiceImpl implements DubboDemoService {

	private static final  Logger log  =  LoggerFactory.getLogger(DubboDemoServiceImpl.class );
	
	@Override
	public String sayHello(String name) {
		log.info("log --> Provider的Info日志测试");
	        return "Hello " + name;
	}
}
