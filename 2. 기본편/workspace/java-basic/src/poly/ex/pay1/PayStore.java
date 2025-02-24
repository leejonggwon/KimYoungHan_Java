package poly.ex.pay1;
// 생성하지 말라고 abstract 사용한다
public abstract class PayStore {

    //findPay불러다 쓰라고 static 사용한다
    public static Pay findPay(String option){
        //결제수단을 선택하는 부분
        if (option.equals("kakao")) {
            return new KakaoPay(); //부모는 자식을 담을 수 있다
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        }else {
            return new DefaultPay();
        }
    }
}
