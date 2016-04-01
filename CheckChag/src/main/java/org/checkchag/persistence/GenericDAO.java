package org.checkchag.persistence;

import java.util.List;

public interface GenericDAO<E, K> {
	//GenericDAO는 모든 DAO들이 기본적으로 DB와 통신할 수 있는 기능을 명세한다.
	//E:VO 타입 K:기본키 타입
	
	//CRUD 
	//insert
	//selectOne
	//selectList
	//update
	//delete
	
	public void insert(E vo) throws Exception;//vo를 데이터베이스에 집어넣는다.
	public E selectOne(K key) throws Exception;//기본키가 key인 데이터 1개를 추출한다.
	public List<E> selectList() throws Exception;//모든 데이터를 가지고온다.
	public void update(E vo) throws Exception;//E 타입의 vo의 속성을 가지고 데이터를 갱신시킨다.
	public void delete(K key) throws Exception;//DB에서 기본키가 key와 동일한 데이터를 삭제시킨다.
	
}
