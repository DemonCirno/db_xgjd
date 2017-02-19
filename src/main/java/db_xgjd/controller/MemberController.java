package db_xgjd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import db_xgjd.model.Member;
import db_xgjd.service.IMemberService;


@Controller
@RequestMapping("/memberController")
public class MemberController {

	private IMemberService memberservice;
	
	
	public IMemberService getMemberservice() {
		return memberservice;
	}

	@Autowired
	public void setMemberservice(IMemberService memberservice) {
		this.memberservice = memberservice;
	}
	
	@RequestMapping("/insertMember")
	public String insertMember(Member member,HttpServletRequest request){
		
		int i = memberservice.insertMember(member);
		request.setAttribute("key", i);
		return "index";
		
	}
}
