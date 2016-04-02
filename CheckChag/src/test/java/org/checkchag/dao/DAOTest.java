package org.checkchag.dao;

import java.util.List;

import javax.inject.Inject;

import org.checkchag.domain.MemberVO;
import org.checkchag.persistence.MemberDAOImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class DAOTest {

	private static final Logger logger = LoggerFactory.getLogger(DAOTest.class);
	
	@Inject
	MemberDAOImpl dao;
	
	//insert
	@Test
	public void test() throws Exception {
		MemberVO vo= new MemberVO();
		vo.setAge(202);
		vo.setEmail("kane72743");
		vo.setUserid("hyun113");
		vo.setUserpwd("12343");
		vo.setUsername("hyunjun");
		dao.insert(vo);
	}

	@Test
	public void test2() throws Exception {
		List<MemberVO> list= dao.selectList();
		for (MemberVO memberVO : list) {
			logger.info(memberVO.toString());
		}
	}
	

	@Test
	public void test3() throws Exception {
		dao.delete("hyun11");
	}
	

	@Test
	public void test4() throws Exception {
		logger.info(dao.selectOne("hyun11").toString());
	}
	
	@Test
	public void test5() throws Exception {
		MemberVO vo= new MemberVO();
		vo.setAge(22);
		vo.setEmail("kane72743");
		vo.setUserid("hyun113");
		vo.setUserpwd("123434444");
		vo.setUsername("Hyunjun");
		dao.update(vo);
	}
}
