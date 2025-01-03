package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++){ //블록 내부 for문 내
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        } //i 생존 종료

        //System.out.println("main i = " + i); //java: cannot find symbol
        System.out.println("main i = " + m);

    }
}
