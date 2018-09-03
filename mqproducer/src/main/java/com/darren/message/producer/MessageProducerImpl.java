package com.darren.message.producer;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.darren.remoteapi.ImessageProducer;

@Component
public class MessageProducerImpl implements ImessageProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Destination destination;

	@Override
	public void sendMessage(String msg) {
		this.jmsTemplate.send(this.destination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(msg);
			}
		});

	}

}
