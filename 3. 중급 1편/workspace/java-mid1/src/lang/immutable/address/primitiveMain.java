package lang.immutable.address;

public class primitiveMain {
    public static void main(String[] args) {
        //기본형은 절대로 값을 공유하지 않는다
        int a = 10;
        int b = a; // a → b, 값을 복사 후 대입

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("----------");

        b = 20;
        System.out.println("20 → b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
