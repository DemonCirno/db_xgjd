package db_xgjd.test;

import java.util.List;

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
public class TestReply {
	private static final Logger logger = Logger.getLogger(TestReply.class);
	private IMemberService memberservice;
	public IMemberService getMemberservice() {
		return memberservice;
	}
	@Autowired
	public void setMemberservice(IMemberService memberservice) {
		this.memberservice = memberservice;
	}
	@Test
	public void test_insert(){
		Member m = new Member();
		m.setMemberid(1);
		m.setContactway("test");
		m.setMembername("test");
		m.setMembersex(true);
		memberservice.addMember(m);
		logger.info(JSON.toJSONStringWithDateFormat(m, "yyyy-MM-dd HH:mm:ss"));
	}
	@Test
	public void test_find(){
		Member m = memberservice.selectMemberById(1);
		logger.info(JSON.toJSONStringWithDateFormat(m, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void test_All(){
		List<Member> list = memberservice.countAll();
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}
}