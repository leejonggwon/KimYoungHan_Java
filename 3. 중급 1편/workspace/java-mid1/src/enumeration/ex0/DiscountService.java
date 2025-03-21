package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price){
        int discountPercent = 0; //몇 프로 할인

        if(grade.equals("BASIC")){
            discountPercent = 10;
        }else if(grade.equals("GOLD")){
            discountPercent = 20;
        }else if(grade.equals("DIAMOND")){
            discountPercent = 30;
        }else{
            System.out.println(grade + ": 할인X");
        }

        //할인된 금액 = 가격 * 할인율 / 100
        return price * discountPercent /100;
    }
}
