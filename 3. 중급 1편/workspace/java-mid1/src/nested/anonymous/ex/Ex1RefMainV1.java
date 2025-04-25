package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    //Process 인터페이스를 넣어준다
    //Dice, Sum 클래스에서 인터페이스 Process를 구현했기 때문에, Process process 매개변수에 들어갈 수 있음
    public static void hello(Process process) { //인스턴스를 전달
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run(); //인스턴스에 있는 매서드를 호출
        //코드 조각 종료

        System.out.println("프로그램 종료");
        System.out.println("----------");
    }

    //주사위
    static class Dice implements Process{

        @Override
        public void run(){
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    //계산
    static class Sum implements Process{

            @Override
            public void run(){
                for (int i = 0; i < 3; i++){
                    System.out.println("i = " + i);
                }
            }
        }

    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);

    }


}
