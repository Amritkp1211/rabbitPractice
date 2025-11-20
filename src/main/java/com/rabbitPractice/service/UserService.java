package com.rabbitPractice.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbitPractice.config.RabbitMQConfig;
import com.rabbitPractice.entity.UserEntity;
import com.rabbitPractice.repo.UserEntityRepo;

@Service
public class UserService {

	@Autowired
	private UserEntityRepo userRepository;

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public UserEntity saveUser(UserEntity user) {
		UserEntity saved = userRepository.save(user);

		rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, saved);
		System.out.println("✅ Published message: " + saved);

		return saved;
	}

}
