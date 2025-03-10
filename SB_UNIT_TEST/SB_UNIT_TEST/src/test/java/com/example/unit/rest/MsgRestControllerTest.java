package com.example.unit.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Service;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.unit.controller.MsgRestController;
import com.example.unit.service.MsgService;

@WebMvcTest(controllers = MsgRestController.class)
public class MsgRestControllerTest {

	@MockBean
	private MsgService msgService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testWelcomeMsg() throws Exception {
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/welcome");

		MvcResult andReturn = mockMvc.perform(mockHttpServletRequestBuilder).andReturn();

		MockHttpServletResponse response = andReturn.getResponse();

		int status = response.getStatus();
		assertEquals(200, status);
	}

	@Test
	public void testGreetMsg() throws Exception {
		when(msgService.getGreetMsg()).thenReturn("Dummy text");
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		
		assertEquals(200, status);
	}
}
