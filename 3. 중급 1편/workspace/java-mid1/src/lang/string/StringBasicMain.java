package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello"); //객체생성
        //String은 클래스(객체) 이므로 참조형이다

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
