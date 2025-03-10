package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.example.kafka.constants.AppConstants;
import com.example.kafka.entity.Order;

@SpringBootApplication
public class MsKafkaConsumerAppApplication {

	@KafkaListener(topics = AppConstants.TOPIC, groupId = "group-ashokit-order")
	public void subscriveMsg(Order order) {
		System.out.println("msg Recieved from Kafka");
		System.out.println(order);
	}

	public static void main(String[] args) {
		SpringApplication.run(MsKafkaConsumerAppApplication.class, args);

	}

}
