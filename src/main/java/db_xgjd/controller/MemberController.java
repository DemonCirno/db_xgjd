package db_xgjd.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import db_xgjd.model.Member;
import db_xgjd.service.IMemberService;

@CrossOrigin
@Controller
@RequestMapping("/memberController")
public class MemberController {
	
	private IMemberService memberserive;

	public IMemberService getMemberserive() {
		return memberserive;
	}

	@Autowired
	public void setMemberserive(IMemberService memberserive) {
		this.memberserive = memberserive;
	}
	
	@RequestMapping("/isExit")
	public @ResponseBody HashMap<String,Integer> isExit(Integer id){
		HashMap<String,Integer> INFO_ISEXIT = new HashMap<String,Integer>();
		Member member = memberserive.selectMemberById(id);
		if(member == null){
			//用户未注册
			INFO_ISEXIT.put("FLAG", 0);
		}else{
			//用户已注册
			INFO_ISEXIT.put("FLAG", 1);
		}
		System.out.println(INFO_ISEXIT.toString());
		return INFO_ISEXIT;
	}
	
	@RequestMapping("/isInsert")
	public @ResponseBody HashMap<String,Integer> register(Member member){
		HashMap<String,Integer> INFO_ISINSERT = new HashMap<String,Integer>();
		int id = member.getMemberid();
		Member member_base = memberserive.selectMemberById(id);
		//成员学号不存在，则注册
		if(member_base == null){
			int count = memberserive.addMember(member);
			if(count>0){
				//插入数据库成功
				INFO_ISINSERT.put("FLAG", 1);
				System.out.println("插入数据成功");
			}else{
				//插入数据库失败
				INFO_ISINSERT.put("FLAG", 0);
			}
		}
		return INFO_ISINSERT;
	}
	
	@RequestMapping("/countAll")
	public @ResponseBody List<Member> countAll(){
		return memberserive.countAll();
	}
}