package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {

        NestedOuter outer = new NestedOuter(); //outer와 nested는 서로 관계가 없다

        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        //getClass() 클래스 정보
        System.out.println("nestedClass = " + nested.getClass());
        //class nested.nested.NestedOuter$Nested
        //패키지이름.바깥클래스$내부클래스
    }
}
