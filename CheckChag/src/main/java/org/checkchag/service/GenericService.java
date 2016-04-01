package org.checkchag.service;

import java.util.List;


public interface GenericService<E, K> {
	
	//GenericService설명
	//GenericService는 DAO와 UI간의 통신할 수 있는 메소드에 대해 명시를 해 놓는 역할을 한다.
	//GenericService를 구현하는 GenericServiceImpl은 아래 메소드를 실제 DAO와 통신 할 수 있게 메소드를 구현한다.
	
	//기능 목록
	// 서비스
	// 회원 등록
	// 조회
	// 회원탈퇴
	// 회원정보수정

	public void register(E vo) throws Exception;// E타입의 VO를 디비에 등록

	public E getVO(K key) throws Exception;// K타입의 key를 통해서 E타입 VO 객체 얻어오기

	public List<E> getList() throws Exception;// VO 객체 전부 얻어오기

	public void delete(K key) throws Exception; // K타입의 key를 통해 데이터 삭제

	public void update(E vo) throws Exception;// E타입의 vo가 가지고 있는 key와 매칭되는 정보 업데이트

}
