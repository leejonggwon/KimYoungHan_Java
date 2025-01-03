package operator;

public class Logical1 {
    public static void main(String[] args) {

        //Ctrl + Shift + enter :문장완성시켜준다
        System.out.println("&&: AND 연산");
        System.out.println(true && true);   //true
        System.out.println(true && false);  //false
        System.out.println(false && false); //false

        System.out.println("||: OR 연산");
        System.out.println(true || true);   //true
        System.out.println(true || false);  //true
        System.out.println(false || false); //false

        System.out.println("! 연산");
        System.out.println(!true);  //false
        System.out.println(!false); //true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

    }
}
