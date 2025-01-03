package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 추가(오버로딩)
    MemberConstruct(String name, int age){
        this(name, age, 50); //변경 //생성자 내부에서 다른 생성자를 호출함 //첫줄에만 사용해야함
    }

    //생성자
    //생성자명 클래스명과 같다, 반환타입없다
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
