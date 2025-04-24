package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();

        //내부클래스 접근방법
        //생성방법이 다름 static 클래스처럼, new InnerOuter.Inner(); 아님
        InnerOuter.Inner inner = outer.new Inner(); //x001.new Inner(); //바깥 인스턴스 참조값을 알고 있다
        inner.print(); //1 2 3

        System.out.println("innerClass = " + inner.getClass()); //클래스 정보
        //innerClass = class nested.inner.InnerOuter$Inner
        // class nested.inner: 패키지 이름
        // InnerOuter: 외부 클래스
        // $Inner: 내부 클래스
    }
}
