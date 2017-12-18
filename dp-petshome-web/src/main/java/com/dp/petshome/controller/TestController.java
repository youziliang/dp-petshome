package com.dp.petshome.controller;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dp.petshome.persistence.model.Test;
import com.dp.petshome.service.TestService;

@Slf4j
@Controller
@RequestMapping(value = "/web")
public class TestController {

	private static Logger LOG = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/testConfig", method = RequestMethod.GET)
	@ResponseBody
	public Test testConfig() {
		Test test = testService.testSelect();
		LOG.info(test.toString());
		return test;
	}

}
