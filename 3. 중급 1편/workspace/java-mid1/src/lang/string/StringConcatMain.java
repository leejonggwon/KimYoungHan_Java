package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        //concat()은 두 개의 문자열을 연결하는 역할
        //원칙적으로는 안되는데 문자열을 자주 다루기 때문에 + 연산을 제공한다
        String result1 = a.concat(b);
        String result2 = a + b;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
