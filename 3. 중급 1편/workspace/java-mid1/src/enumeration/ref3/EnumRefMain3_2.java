package enumeration.ref3;


public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        //DiscountService를 사용할 필요가 없어졌다
        System.out.println("BASIC 등급의 할인금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인금액: " + Grade.DIAMOND.discount(price));
    }
}
