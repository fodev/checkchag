package org.checkchag.persistence;

import java.util.List;

import org.checkchag.domain.MemberVO;

public class MemberDAOImpl extends GenericDAOImpl<MemberVO, String> implements MemberDAO {
	//MemberDAOImpl은 MemberDAO Interface를 구현함으로써 MemberDAO가 필요한 기능을 명세시켜줬고
	//GenericDAOImpl을 상속함으로써 필요한 MemberDAO가 필요로 하는 기능들을 구현해주었다.
	
	//MemberDAO가 사용할 SQL문의 경로를 기능 구현하고 있는 GenericDAOImpl에게 넘겨줌으로써 
	//SQL문의 namespace위치를 잡아준다.
	public MemberDAOImpl() {
		super("org.checkchag.persistence.MemberMapper.");//매퍼가 정의되어있는 네임스페이스(패스)를 설정해준다.
		// TODO Auto-generated constructor stub
	}
	
}
