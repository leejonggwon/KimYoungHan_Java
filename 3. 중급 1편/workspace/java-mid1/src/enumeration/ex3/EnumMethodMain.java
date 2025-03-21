package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        //모든 ENUM을 반환
        Grade[] values = Grade.values();
        //배열항목 출력
        System.out.println("values = " + Arrays.toString(values));
        System.out.println("----------");

        //name(): ENUM상수를 문자열로 반환
        //ordinal(): 선언순서 반환
        for (Grade value : values) {
            System.out.println("name= " + value.name() + " ordinal= " + value.ordinal());
        }
        System.out.println("----------");

        //String → ENUM 변환, 잘못된 문자가 들어가면 예외가 발생한다
        //valueOf(String name): 주어진 이름과 일치하는 ENUM 상수를 반환한다
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); //toString() 오버라이딩 가능
    }
}
