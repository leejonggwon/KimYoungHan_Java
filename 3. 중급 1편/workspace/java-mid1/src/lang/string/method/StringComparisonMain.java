package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello Java!"; //대문자 일부 있음
        String str2 = "hello java!"; //대문자 없음 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); //b와 a는 1개 차이 난다
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a")); //2
        System.out.println("'a' compareTo 'b': " + "a".compareTo("b")); //-1

        System.out.println("'str1' compareTo 'str3': " + str1.compareTo(str3)); //-13
        //str1이 str3보다 사전순으로 앞에 있음
        System.out.println("'str1' compareToIgnoreCase 'str2': " + str1.compareToIgnoreCase(str2)); //0

        //str1은 'Hello'로 시작하는가
        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello")); //true
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));
    }
}
