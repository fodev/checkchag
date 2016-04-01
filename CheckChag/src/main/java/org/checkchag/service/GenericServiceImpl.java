package org.checkchag.service;

import java.util.List;

import org.checkchag.persistence.GenericDAO;

public abstract class GenericServiceImpl<S extends GenericDAO<E, K>, E,K> implements GenericService<E, K>{
	//GenericService에서는 기능을 명세하고 
	//GenericServiceImpl에서는 기능을 구현한다.
	//기능을 구현함에 있어서 dao가 필요로 한데 특정한 타입으로 정하게되면 특정한 타입의 Service로 밖에 
	//동작하지 않는다 따라서 DAO의 기능을 할 수 있는 타입의 객체가 필요하다고 명시 해야될 필요성이있는데
	//그 부분이 바로 S extends GenericDAO<E, K>부분에 해당한다. S는 DAO의 기능들을 할 수 있는 
	//DAO GenericDAO구현 객체라는의미가 된다.
	
	//dao를 넣어줘야하는데 dao는 현재 Generic으로 선언되어있어서 어떠한 DAO를 통해 DB와 연동을 할지 알 수없다.
	//따라서 dao는 추상클래스의 생성자를 통해 하위 클래스가 dao를 집어넣을수있도록 구현해야한다.
	private S dao;
	public GenericServiceImpl(S dao) {
		this.dao=dao;
	}
	
	@Override
	public void register(E vo) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(vo);
	}

	@Override
	public E getVO(K key) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectOne(key);
	}

	@Override
	public List<E> getList() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	@Override
	public void delete(K key) throws Exception {
		dao.delete(key);
		
	}

	@Override
	public void update(E vo) throws Exception {
		dao.update(vo);
		
	}
	


	
}
