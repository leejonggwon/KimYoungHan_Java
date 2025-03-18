package lang.wapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(10);
        //숫자를 래퍼 겍체로 반환

        Integer i2 = Integer.valueOf("10");
        //문자열을 래퍼 객체로 반환하는 것도 가능함

        int intValue = Integer.parseInt("10");
        //문자열 전용기능, 기본형으로 변환함

        //비교
        //compareTo(): 내 값과 인수로 넘어온 값을 비교한다.
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        //산술연산
        System.out.println("sum: " + Integer.sum(10,20));
        System.out.println("min: " + Integer.min(10,20));
        System.out.println("max: " + Integer.max(10,20));

    }
}
