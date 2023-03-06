package spring_basic.part3_membership_mvc.controller;

//웹 등록 화면에서 데이터를 전달 받을 형식
public class MemberForm {
    //변수
    private String name;

    //메서드
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
