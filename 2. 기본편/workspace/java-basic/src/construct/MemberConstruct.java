package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 생성
    //생성자이름 클래스명과 같다, 반환타입없다
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //생성자 추가(오버로딩)
    MemberConstruct(String name, int age){
        this(name, age, 50); //this() 자기자신의 생성자를 호출
                                   //this()는 생성자 코드의 첫줄에만 작성할 수 있다.
//        중복제거
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }
}
