package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {

        NestedOuter outer = new NestedOuter();

        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        //getClass() 클래스의 정보
        System.out.println("nestedClass = " + nested.getClass());
        //class nested.nested.NestedOuter$Nested
        //클래스.바깥클래스$내부클래스

    }
}
