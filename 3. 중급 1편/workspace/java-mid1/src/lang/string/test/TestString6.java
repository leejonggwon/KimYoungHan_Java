package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        while(index >= 0){ //문자열 길이가 크거나 같을 때 -1 반환함
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println(count);





    }
}
