package com.activemq.controller;

import java.io.UnsupportedEncodingException;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.activemq.service.MessagePushService;

/**
 * 消息推送的controller
 * @author kang
 *
 */
@Controller
public class StringPushController {
	//注入服务
	@Autowired
	private MessagePushService service;
	
	//注入消息目的地，这里是queue，一对一
	@Autowired
	@Qualifier("queueDestination")
	private Destination destination;
	
	@RequestMapping("/message/push")
	public void sendMessage(String message) {
		System.out.println("生产者开始推送-------");
		try {
			service.pushMessage(destination, new String(message.getBytes("iso8859-1"), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
