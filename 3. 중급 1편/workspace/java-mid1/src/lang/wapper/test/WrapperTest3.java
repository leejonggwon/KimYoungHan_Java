package lang.wapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
       String str =  "100";

        //String → Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer → int
        int inValue = integer1.intValue();
        System.out.println("inValue = " + inValue);

        //int → Integer
        Integer integer3 = Integer.valueOf(inValue);
        System.out.println("integer3 = " + integer3);
    }
}
