package org.checkchag.domain;

import java.util.Date;

public class MemberVO {
	//디비에 저장하기 위한 VO생성 휘발성 객체
	

	private String userid;
	private String userpwd;
	private int age;
	private String email;
	private Date regdate;
	private Date updatedate;
	//인스턴스 변수를 만들때는 테이블 컬럼 명과 동일하게 잡아야한다.
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpwd=" + userpwd + ", age=" + age + ", email=" + email
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
	
	
}


