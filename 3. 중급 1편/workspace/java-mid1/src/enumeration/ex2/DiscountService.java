package enumeration.ex2;

public class DiscountService {

    //ClassGrade 타입을 받는다
    public int discount(ClassGrade classGrade, int price){
        int discountPercent = 0;

        if(classGrade == ClassGrade.BASIC){ //x001 == x001 이런식으로 진행
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        }else{
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
