package enumeration.ref3;


public class DiscountService {

    public int discount(Grade grade, int price){
        //return price * grade.getDiscountPercent() / 100;

        //Grade에 있는 discount 호출한다
        return grade.discount(price);
    }
}
