package db_xgjd.service;

import java.util.List;

import db_xgjd.model.Member;

public interface IMemberService {
	
	//添加成员
	public Integer addMember(Member member);
	
	//根据学号查找成员
	public Member selectMemberById(Integer id);
	
	//查找所有成员
	public List<Member> countAll();
	
}
