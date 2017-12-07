package com.activemq.service.impl;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.activemq.service.MessagePushService;
/**
 * 消息推送的实现类
 * @author kang
 *
 */
@Service
public class MessagePushServiceImpl implements MessagePushService {
	/**
	 * 注入spring提供的模板：用于推送消息
	 */
	@Autowired
	private JmsTemplate jmsTemplate;
	
	/**
	 * 消息推送的方法
	 */
	@Override
	public void pushMessage(Destination destination, Object message) {
		jmsTemplate.send(destination, new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage((String) message);
			}
		});
	}

}
