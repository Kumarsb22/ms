package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafka.constants.KafkaConstants;
import com.example.kafka.entity.Order;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;

	public String publishMsg(Order order) {
		kafkaTemplate.send(KafkaConstants.TOPIC, order);
		return "msg publiched to kafka topic";

	}
}
