package extend1.super2;

public class ClassC extends ClassB{

    //기본생성아님 //ClassB에는 기본생성자 없음 자바는 기본 생성자 만들지 않음
    public ClassC() {
        //기본생성자 아니므로 super를 직접정의해야함
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}
