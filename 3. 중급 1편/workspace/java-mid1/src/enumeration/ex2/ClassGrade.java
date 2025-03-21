package enumeration.ex2;
//회원등급을 다루는 클래스

public class ClassGrade {
    //타입 안전 열거형 패턴
    //회원등급을 다루는 클래스를 만들고, 각각의 회원 등급별로 상수를 선언한다
    // 정해진 객체만 사용으로 타입 안정성 향상, 데이터 일관성 보장
    public static final ClassGrade BASIC = new ClassGrade();   //x001
    public static final ClassGrade GOLD = new ClassGrade();    //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    //private 생성자를 추가로
    //외부에서 생성하지 못하게 막는다
    private ClassGrade(){}
}
