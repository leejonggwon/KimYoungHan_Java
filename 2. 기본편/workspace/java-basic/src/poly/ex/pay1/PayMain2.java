package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true){
            System.out.print("결제 수단을 입력하세요: ");
            String payOption = scanner.nextLine();

            if(payOption.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();//버퍼이슈해결함
            payService.processPay(payOption, amount);
        }
    }
}
