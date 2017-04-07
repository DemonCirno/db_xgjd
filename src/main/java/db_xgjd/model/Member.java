package db_xgjd.model;

public class Member {
    private Integer memberid;

    private Boolean membersex;

    private String membername;

    private String memberclass;

    private String subjects;

    private String contactway;

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public Boolean getMembersex() {
        return membersex;
    }

    public void setMembersex(Boolean membersex) {
        this.membersex = membersex;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public String getMemberclass() {
        return memberclass;
    }

    public void setMemberclass(String memberclass) {
        this.memberclass = memberclass == null ? null : memberclass.trim();
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects == null ? null : subjects.trim();
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway == null ? null : contactway.trim();
    }
}