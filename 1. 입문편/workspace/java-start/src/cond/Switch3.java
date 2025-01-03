package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2: //break가 없으므로 case3으로 수행이 된다
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;

        }
        System.out.println("발급받은 쿠폰 " + coupon);

    }
}
