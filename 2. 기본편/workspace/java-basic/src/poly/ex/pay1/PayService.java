package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        //변하지 않는 부분

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        //부모
        //결제수단을 보관하고 있는곳에 결제수단을 찾는다
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
