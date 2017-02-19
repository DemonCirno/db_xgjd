package db_xgjd.service;

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
	public int insertMember(Member member) {
		return membermapper.insert(member);
	}

}
