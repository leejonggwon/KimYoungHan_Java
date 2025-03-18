package lang.wapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
       String str =  "100";

       //오토박싱, 오토 언박싱을 사용해서 변환

       //String → Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer → int
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        //int → Integer
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);

    }
}
