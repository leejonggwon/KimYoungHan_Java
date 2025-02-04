package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        //스택구조임(후입선출)

        System.out.println("main start");
        method1(10);
        System.out.println("main end"); //Ctrl + W :문단선택하기
    }

    static void method1(int m1){
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
