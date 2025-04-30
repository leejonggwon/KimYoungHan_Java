package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();

        //내부클래스는 생성방법이 다름 new InnerOuter.Inner(); 아님
        //x001.new Inner(); 이런식으로 생성해준다
        //outer는 바깥클래스의 인스턴스 참조를 가진다
        //내부클래스는 바깥인스턴스가 있어야 생성할 수 있다
        InnerOuter.Inner inner = outer.new Inner();
        inner.print(); //1 2 3

        System.out.println("----------");
        System.out.println("innerClass = " + inner.getClass()); //클래스 정보
        //innerClass = class nested.inner.InnerOuter$Inner
        //패키지이름.외부클래스$내부 클래스
    }
}
