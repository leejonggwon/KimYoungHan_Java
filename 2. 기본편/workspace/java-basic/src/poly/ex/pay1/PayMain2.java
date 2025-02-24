package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while(true){
            System.out.print("결제 수단을 입력하세요: ");
            String payOption = scanner.nextLine();

            if(payOption.equals("exit")){
                System.out.print("프로그램을 종료합니다.");
                return; //메서드 종료
            }

            System.out.print("결제 금액을 입력하세요");
            int amount = scanner.nextInt();
            scanner.nextLine(); //버퍼문제 해결

            payService.processPay(payOption, amount);

        }



    }
}
