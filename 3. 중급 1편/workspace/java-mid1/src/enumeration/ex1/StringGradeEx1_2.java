package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인금액: " + basic);
        System.out.println("GOLD 등급의 할인금액: " + gold);
        System.out.println("DIAMOND 등급의 할인금액: " + diamond);
        System.out.println("-----------");

        //존재하지 않는 등급을 입력하는 경우
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인금액: " + vip);

        //오타를 입력하는 경우
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인금액: " + diamondd);

        //소문자를 입력하는 경우
        gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
}
