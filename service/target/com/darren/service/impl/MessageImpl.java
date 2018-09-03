package com.darren.service.impl;

import java.net.SocketException;

import org.springframework.stereotype.Component;

import com.darren.remoteapi.IMessage;
import com.darren.service.NetworkUtil;

@Component("messageImpl")
public class MessageImpl implements IMessage {

	@Override
	public String echo(String msg) {

		try {
			String ip = NetworkUtil.getLocalIp();
			return ip + "-------------->" + msg;
		} catch (SocketException e) {
			return " CAN NOT GET IP " + msg;
		}
	}

}
