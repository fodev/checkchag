package org.checkchag.controller;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class ControllerTest {
	private static final Logger logger = LoggerFactory.getLogger(ControllerTest.class);

	@Inject
	private WebApplicationContext wac;
	private MockMvc mockMvc;

	//테스트를 하기전에 준비작업을 하는역할 Before
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("setup....................");
	}

	@Test
	public void test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/check/register"));
		//url 에 접근을 해주는 기능+ 서버를 실행해주는 기능을 해줌 
		
	}

	@Test
	public void test2() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/check/list"));
		//url 에 접근을 해주는 기능+ 서버를 실행해주는 기능을 해줌 
		
	}
}
