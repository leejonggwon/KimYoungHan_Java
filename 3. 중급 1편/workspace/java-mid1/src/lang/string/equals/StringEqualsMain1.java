package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교: " + (str1 == str2));
        //false //동일성(참조)
        System.out.println("new String() equals 비교: " +(str1.equals(str2)));
        //true //동등성(논리)

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " +(str3 == str4)); //true
        //문자열 리터럴해서 문자열풀에 hello 만들고, 동일한 것이 있으면 만들지 않는다

        System.out.println("리터럴 equals 비교: " +(str3.equals(str4)));
    }
}
