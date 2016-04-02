package org.checkchag.persistence;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;

public abstract class GenericDAOImpl<E, K> implements GenericDAO<E, K> {
	// GenericDAOImpl은 DAO가 공통적으로 가지는 로직을 구현함으로써 상속을 이용해 간편하게 여러 DAO를 제작할 수있게
	// 도와준다.
	// 모든 DAO들이 공통적으로 가지는 메소드를 미리 정의하고 타입을 미룸으로써 로직을 공유할 수 있게된다.

	// ex)Member DAO를 insert하기 위해서는 session.insert(패키지명+"insert",MemberVO 타입의
	// vo)
	// Board DAO를 insert하기 위해서는 session.insert(패키지명+"insert",BoardVO 타입의 vo)
	// 로직은 동일하지만 패키지명과 타입만 다르다 그래서 로직을 공유하고 타입을 나중에 생각하도록 설계한다.


	
	
	// DAO는 DB와 관련된 작업을 위해 연결을 맺고 작업을 처리하고 예외를 처리하고 연결을 끊는 작업을 해줘야한다.
	// 하지만 모든 Sql문을 처리만 다르고 연결을 맺고 예외를 처리하고 연결을 끊는 부분은 동일하기 때문에
	// TempletePattern을 이용하여 예외 처리와 Connection와 close()처리를 해준다.
	@Inject
	protected SqlSessionTemplate sqlSession;
	
	
	//각각의 DAO가 호출해야 할 Sql mapper 경로는 서로 동일하지 않다. 
	//따라서 그 경로는 GenericDAOImpl 구현 클래스를 통해 받아서 처리 해줘야 한다.
	
	private String path;
	public GenericDAOImpl(String path) {
		//추상클래스에 생성자를 만듦으로써 구현클래스에서도 생성자를 만들어줘야한다.
		//구현 클래스에서 생성자를 만들때 Mapper package의 위치를 넣어주도록 하자.
		
		this.path=path;
	}

	
	//모든 DAO들의 공통적인 CRUD의 작업
	@Override
	public void insert(E vo) throws Exception {
		sqlSession.insert(this.path+"insert", vo);
	}

	@Override
	public E selectOne(K key) throws Exception {
		return sqlSession.selectOne(this.path+"selectOne",key);//key값을 가지는 Object하나를 리턴함
	}

	@Override
	public List<E> selectList() throws Exception {
		return sqlSession.selectList(this.path+"selectAll");
	}

	@Override
	public void update(E vo) throws Exception {
		sqlSession.update(this.path+"update", vo);

	}

	@Override
	public void delete(K key) throws Exception {
		sqlSession.delete(this.path+"delete",key);
	}
	
	

}
