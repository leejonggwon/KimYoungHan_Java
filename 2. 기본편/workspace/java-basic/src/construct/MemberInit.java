package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade){
        this.name = name; //this란 인스턴스 자기자신의 참조값이다
        this.age = age;
        this.grade = grade;
    }
}

