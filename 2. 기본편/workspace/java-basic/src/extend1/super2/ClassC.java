package extend1.super2;

public class ClassC extends ClassB{

    //기본생성아님 //ClassB에는 기본생성자 없음 자바는 기본 생성자 만들지 않음
    public ClassC() {
        //ClassB에 생성자가 정의되었으므로 기본생성자가 없으므로 super()를 사용못함
        //직접정의해야함
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}
