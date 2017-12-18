package com.dp.petshome.service.impl;

import org.springframework.stereotype.Service;

import com.dp.petshome.service.DubboDemoService;

@Service
public class DubboDemoServiceImpl implements DubboDemoService {

	@Override
	public String sayHello(String name) {
	        return "Hello " + name;
	}
}
