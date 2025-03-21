package enumeration.ex1;

public class DiscountService {

    //String 말고 다른것으로 받을 수 있게 한다
    public int discount(String grade, int price){
        int discountPercent = 0;

        //상수를 사용한다
        if(grade.equals(StringGrade.BASIC)){
            discountPercent = 10;
        }else if(grade.equals(StringGrade.GOLD)){
            discountPercent = 20;
        }else if(grade.equals(StringGrade.DIAMOND)){
            discountPercent = 30;
        }else{
            System.out.println(grade + ": 할인X");
        }

        //할인된 금액 = 가격 * 할인율 / 100
        return price * discountPercent /100;
    }
}
