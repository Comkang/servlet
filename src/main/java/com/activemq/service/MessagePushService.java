package com.activemq.service;

import javax.jms.Destination;

/**
 * 消息推送接口
 * @author kang
 *
 */
public interface MessagePushService {
	/**
	 * 消息推送的方法
	 * @param destination 消息目的地（p2p/topic）
	 * @param message
	 */
	void pushMessage(Destination destination, Object message);
}
