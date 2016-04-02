package org.checkchag.domain;

import java.util.Date;

public class MemberVO {
	//디비에 저장하기 위한 VO생성 휘발성 객체
	

	private String userid;
	private String userpwd;
	private String username;
	private String email;
	private int age;
	private Date regdate;
	private Date updatedate;
	//인스턴스 변수를 만들때는 테이블 컬럼 명과 동일하게 잡아야한다.
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", email=" + email
				+ ", age=" + age + ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
	
	
}


