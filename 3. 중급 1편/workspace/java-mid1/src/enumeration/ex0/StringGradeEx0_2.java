package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //다음과 같은 문제 발생시
        //1.존재하지 않는 등급을 입력하는 경우
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인금액: " + vip);

        //2.오타를 입력하는 경우
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인금액: " + diamondd);

        //3.소문자를 입력하는 경우
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
}
