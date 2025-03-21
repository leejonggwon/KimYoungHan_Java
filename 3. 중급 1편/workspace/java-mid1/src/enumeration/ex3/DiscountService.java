package enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade, int price){
        int discountPercent = 0;

        //상수이기 때문에 static import를 쓸 수있다
        // Alt + Enter → add on demand import ..로 코드 줄일수 있다
        if(grade == Grade.BASIC){
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        }else{
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
