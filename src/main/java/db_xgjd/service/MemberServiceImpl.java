package db_xgjd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import db_xgjd.dao.MemberMapper;
import db_xgjd.model.Member;

@Service("memberService")
public class MemberServiceImpl implements IMemberService {

	private MemberMapper membermapper;
	
	public MemberMapper getMembermapper() {
		return membermapper;
	}

	@Autowired
	public void setMembermapper(MemberMapper membermapper) {
		this.membermapper = membermapper;
	}

	@Override
	public Integer addMember(Member member) {
		// TODO Auto-generated method stub
		return membermapper.insert(member);
	}

	@Override
	public Member selectMemberById(Integer id) {
		// TODO Auto-generated method stub
		return membermapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Member> countAll() {
		// TODO Auto-generated method stub
		return membermapper.countAll();
	}
 
}
