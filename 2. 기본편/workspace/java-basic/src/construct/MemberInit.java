package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //기본생성자: 매개변수가 없는생성자 자동으로 만들어줌
    MemberInit(){//생성자 필요
    }

    //추가
    void initMember(String name, int age, int grade){
        this.name = name; //this란 인스턴스 자기자신의 참조값이다
        this.age = age;
        this.grade = grade;
    }
}

