package enumeration.ex3;

import enumeration.ex2.DiscountService;

public class ClassGradeEx3_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

/*
        //enum은 열거형 내부에서 상수로 지정하는 것 외에 직접 생성이 불가능하다
        Grade grade = new Grade();
        int result = discountService.discount(grade, price);
        System.out.println("result price: " + result);
*/
    }
}
