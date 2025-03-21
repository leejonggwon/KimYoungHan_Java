package enumeration.ref3;

public class EnumRefMain3_4 {
    //새로운 등급이 추가되더라도 main()코드의 변경 없이 모든 등급의 할인을 출력해보자.
    public static void main(String[] args) {
        int price = 10000;

        //Grade.values(): Grade 열거형의 모든 상수를 배열로 구할 수 있다
        Grade[] values = Grade.values();
        for (Grade grade : values) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " 등급의 할인금액: " + grade.discount(price));
    }
}
