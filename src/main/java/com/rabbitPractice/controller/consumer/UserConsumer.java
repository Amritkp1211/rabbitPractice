package com.rabbitPractice.controller.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitPractice.config.RabbitMQConfig;
import com.rabbitPractice.entity.UserEntity;

@Component
public class UserConsumer {

	@RabbitListener(queues = RabbitMQConfig.QUEUE)
	public void receiveMessage(UserEntity user) {
		System.out.println("📩 Received message from queue: " + user);
	}
}
