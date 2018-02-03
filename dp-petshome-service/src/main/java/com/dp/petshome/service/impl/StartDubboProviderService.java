package com.dp.petshome.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartDubboProviderService {
	
	/**
	 * @Attention 使用之前请开启数据库
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath*:spring/applicationContext.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
