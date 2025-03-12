package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf 메서드
        String numString = String.valueOf(num); //num을 String으로 바꾼다
        System.out.println("숫자의 문자열 값: " + numString);
        String boolString = String.valueOf(bool); //문자 "true"가 된다
        System.out.println("불리언의 문자열 값: " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objString);

        //문자 + x → 문자
        String numString2 = "" + num; //문자로 바뀜 //"100"
        System.out.println("빈문자열 + num " + numString2);

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환" + strCharArray); //참조값으로 출력
        System.out.println(strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
