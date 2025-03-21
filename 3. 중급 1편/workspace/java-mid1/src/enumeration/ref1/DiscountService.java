package enumeration.ref1;

public class DiscountService {

    //ClassGrade 타입을 받는다
    public int discount(ClassGrade classGrade, int price){

        //int discountPercent = classGrade.getDiscountPercent();
        //return price * discountPercent / 100;

        return price * classGrade.getDiscountPercent() / 100;
        //중복변수선택 + Ctrl + Alt + N : Inline Variable
    }
}
