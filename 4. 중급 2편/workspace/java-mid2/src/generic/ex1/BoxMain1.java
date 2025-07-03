package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox(); //숫자를 보관하는 IntegerBox 생성
        integerBox.set(10); //오토박싱
        Integer integer = integerBox.get(); //값 꺼내기
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
