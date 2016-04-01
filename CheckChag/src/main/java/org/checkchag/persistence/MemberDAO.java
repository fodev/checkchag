package org.checkchag.persistence;

import org.checkchag.domain.MemberVO;

public interface MemberDAO extends GenericDAO<MemberVO, String> {
	// 멤버DAO인터페이스는 DAO가 가져야 할 메소드를 가진다.
	// 이때 MemberDAO는 Generic의 타입을 명시해줌으로써 MemberDAO가 구현되는 클래스는
	// MemberVO에 관련된 CRUD작업(Generic에 정의된)을 처리하게된다.
	// Member Table은 기본키를 userid로 설계할 것이기 때문에 기본키는 String타입으로 정의된다.
	
}
