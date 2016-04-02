package org.checkchag.service;

import java.util.List;

import javax.inject.Inject;

import org.checkchag.domain.MemberVO;
import org.checkchag.persistence.GenericDAO;

public class MemberServiceImpl extends GenericServiceImpl<GenericDAO<MemberVO,String>, MemberVO, String> implements MemberService {

	//MemberServiceImpl Bean을 만들때 dao를 만들어서 사용한다.
	public MemberServiceImpl(GenericDAO<MemberVO, String> dao) {
		super(dao);
	}

}
