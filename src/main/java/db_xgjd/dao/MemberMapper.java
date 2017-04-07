package db_xgjd.dao;

import java.util.List;

import db_xgjd.model.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer memberid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memberid);
    
    List<Member> countAll();

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}