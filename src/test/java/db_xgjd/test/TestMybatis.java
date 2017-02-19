package db_xgjd.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import db_xgjd.model.Member;
import db_xgjd.service.IMemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {
	
	private static final Logger logger = Logger.getLogger(TestMybatis.class);
	
	private IMemberService memberservice;

	public IMemberService getMemberservice() {
		return memberservice;
	}

	@Autowired
	public void setMemberservice(IMemberService memberservice) {
		this.memberservice = memberservice;
	}
	
	@Test
	public void test_1(){
		Member member = new Member();
		member.setMemebrstuid(11);
		int i = memberservice.insertMember(member);
		System.out.println(i);
		logger.info(JSON.toJSONStringWithDateFormat(member, "yyyy-MM-dd HH:mm:ss"));
	}
}
