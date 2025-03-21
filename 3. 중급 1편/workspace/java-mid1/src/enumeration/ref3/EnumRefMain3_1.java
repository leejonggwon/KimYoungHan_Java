package enumeration.ref3;


public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);
        //Grade가 스스로 할인율을 계산하면서 DiscountService 클래스가 더는 필요하지 않게 되었다

        System.out.println("BASIC 등급의 할인금액: " + basic);
        System.out.println("GOLD 등급의 할인금액: " + gold);
        System.out.println("DIAMOND 등급의 할인금액: " + diamond);
    }
}
