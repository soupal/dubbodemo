package com.darren.mytest01;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.darren.remoteapi.IMessage;

@ContextConfiguration(locations = { "classpath:spring-dubbo-consumer.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessage {

	@Resource
	private IMessage message;

	@Test
	public void testEcho() {
		System.out.println("\r\n*********************************************\r\n" + message.echo("Hello World!")
				+ "\r\n*********************************************\r\n");
	}

}
