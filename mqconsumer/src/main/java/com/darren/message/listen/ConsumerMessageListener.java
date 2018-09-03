package com.darren.message.listen;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.darren.remoteapi.IMessage;

@Component("consumerMessageListener")
public class ConsumerMessageListener implements MessageListener {

	@Autowired
	private IMessage message;

	@Override
	public void onMessage(Message message) {

		if (message instanceof TextMessage) {
			TextMessage textMsg = (TextMessage) message;
			try {
				System.out.println("\r\n**************************************************\r\n"
						+ this.message.echo(textMsg.getText())
						+ "\r\n**************************************************\r\n");
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}

	}

}
