package exception.ex3;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) { //예외 던진다

        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            //체크예외를 잡거나 던진다
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
