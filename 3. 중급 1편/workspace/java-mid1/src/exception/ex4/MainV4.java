package exception.ex4;

import exception.ex4.exception.SendExceptionV4;
import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) { //예외 던진다
        //NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            //Exception 으로 예외를 공통으로 잡는다
            try {
                networkService.sendMessage(input);
            } catch (Exception e){   //공통예외처리
                exceptionHandler(e); //e 도 참조객체이므로 메서드에 던질수 있다
            }

            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    //공통 예외 처리
    //해결할 수 없는 예외가 발생하면 사용자에게는 시스템 내에 알수 없는 문제가 발생했다고 알리는것이 좋음
    private static void exceptionHandler(Exception e) {
        //공통 처리 로직
        System.out.println("사용자 메시지: 죄송합니다 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지=="); //개발자가 본다고 가정
        //e.printStackTrace(System.out); //예외 메시지와 스택 트레이스 출력
        //e.printStackTrace(System.err);
        //e.printStackTrace();

        //필요하면 예외 별로 별도의 추가 처리 가능
        //e가 SendExceptionV4 타입이면, sendEx라는 이름으로 형변환해서 객체를 담는다
        if(e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송오류] 전송 데이터: " + sendEx.getSendData() );
        }
    }
}
