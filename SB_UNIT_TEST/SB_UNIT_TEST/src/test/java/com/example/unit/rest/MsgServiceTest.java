package com.example.unit.rest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.unit.service.MsgService;

@SpringBootTest
public class MsgServiceTest {

	@Autowired
	private MsgService msgService;

	@Test
	public void testWelcomeMsg() {
		String welcomeMsg = msgService.getWelcomeMsg();
		assertNotNull(welcomeMsg);
	}

	@Test
	public void testGreetMsg() {
		String greetmsg = msgService.getGreetMsg();
		assertNotNull(greetmsg);
	}

}
