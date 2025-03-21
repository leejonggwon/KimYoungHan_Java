package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        //실수로 잘못 입력하면 컴파일오류가 발생한다
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인금액: " + basic);
        System.out.println("GOLD 등급의 할인금액: " + gold);
        System.out.println("DIAMOND 등급의 할인금액: " + diamond);
    }
}
