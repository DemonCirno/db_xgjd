package db_xgjd.service;

import java.util.List;

import db_xgjd.model.Member;

public interface IMemberService {
	
	//��ӳ�Ա
	public Integer addMember(Member member);
	
	//����ѧ�Ų��ҳ�Ա
	public Member selectMemberById(Integer id);
	
	//�������г�Ա
	public List<Member> countAll();
	
}
