package com.activemq.controller;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * 消息接收者
 * @author kang
 *
 */
public class MessageReceviedController implements MessageListener {

	@Override
	public void onMessage(Message message) {
		try {
			TextMessage textMessage = (TextMessage) message;
			String receMessage = textMessage.getText();
			System.out.println("开始接收了------");
			System.out.println(receMessage);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
