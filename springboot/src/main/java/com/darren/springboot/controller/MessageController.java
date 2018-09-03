package com.darren.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darren.remoteapi.IMessage;

@RestController
public class MessageController {

	@Autowired
	private IMessage message;

	@RequestMapping("/info")
	public String info(String msg) {
		return this.message.echo(msg);
	}

}
