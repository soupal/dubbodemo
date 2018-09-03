package com.darren.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.darren.remoteapi.IMessage;

@Controller
@RequestMapping("/pages/messages/*")
public class MessageAction {
	
	@Resource
	private IMessage message;
	
	@RequestMapping("echo")
	public ModelAndView echo(String msg) {
		ModelAndView mav = new ModelAndView("messages/show");
		mav.addObject("info", this.message.echo(msg));
		return mav;
	}

}
