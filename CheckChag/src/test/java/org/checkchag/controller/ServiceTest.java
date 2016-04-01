package org.checkchag.controller;

import java.util.List;

import javax.inject.Inject;

import org.checkchag.domain.MemberVO;
import org.checkchag.service.MemberServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class ServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(ServiceTest.class);
	
	@Inject
	MemberServiceImpl service;
	
	@Test
	public void test() throws Exception{
		List<MemberVO> list=service.getList();
		for (MemberVO memberVO : list) {
			logger.info(memberVO.toString());
		}
	}
	
	@Test
	public void test2() throws Exception{
		logger.info(service.getVO("hyun11").toString());
	}
	
	@Test
	public void test3() throws Exception{
		service.delete("hyun11");
	}
	
	@Test
	public void test4() throws Exception{
		MemberVO vo=new MemberVO();
		vo.setAge(30);
		vo.setEmail("kane7274");
		vo.setUserpwd("guswns");
		vo.setUserid("hyun113");
		service.update(vo);
	
	}
	

	@Test
	public void test5() throws Exception{
		MemberVO vo=new MemberVO();
		vo.setAge(24);
		vo.setEmail("kane0625");
		vo.setUserpwd("guswns3");
		vo.setUserid("hyun1134");
		service.register(vo);
	
	}
}
