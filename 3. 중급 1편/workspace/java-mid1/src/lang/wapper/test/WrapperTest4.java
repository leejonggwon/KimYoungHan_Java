package lang.wapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
       String str =  "100";

        //String → Integer
        //다른 타입간의 전환이므로 오토박싱이 안됨
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer → int
        //오토 박싱 //래퍼타입간의 변환은 오토박싱이 지원됨
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        //int → Integer
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);

    }
}
