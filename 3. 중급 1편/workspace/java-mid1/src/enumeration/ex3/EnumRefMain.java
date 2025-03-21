package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());
        System.out.println("-----------");

        System.out.println("ref BASIC = " + Grade.BASIC);
        //enum은 자동으로 toString 오버라이딩 되어있음
        System.out.println("-----------");

        //참조값 출력
        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));

    }

    //참조값을 보는 메서드
    private static String refValue(Object grade){ //Object grade == Grade grade
        return Integer.toHexString(System.identityHashCode(grade));
        //Integer.toHexString() 숫자를 16진수로 바꾸고
        //System.identityHashCode() 참조값을 숫자로 반환

    }
}
