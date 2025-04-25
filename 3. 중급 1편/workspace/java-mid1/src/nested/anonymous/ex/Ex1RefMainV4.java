package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {

    public static void hello(Process process) { //인스턴스를 전달
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run(); //인스턴스에 있는 매서드를 호출
        //코드 조각 종료

        System.out.println("프로그램 종료");
        System.out.println("----------");
    }

    public static void main(String[] args) {

        System.out.println("Hello 실행");

        hello(new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        hello(new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });

    }
}
