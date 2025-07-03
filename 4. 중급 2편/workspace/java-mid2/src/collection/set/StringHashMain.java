package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA); //char 형을 int 형으로 캐스팅하면, 문자의 고유한 숫자를 확인할 수 있다
        System.out.println("charB = " + (int)charB);
        System.out.println();

        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));
        System.out.println();

        //hashIndex: hashCode를 통해서 문자가 숫자로 출력되었으니 hashIndex를 출력할 수 있다
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A"))); //"A"를 해시인덱스로 변환
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }


    //문자를 넣으면 숫자로 반환하는 메서드
    static int hashCode(String str){
        char[] charArray = str.toCharArray(); //문자열을 한 글자씩 쪼개서 문자배열로 변환한다
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int)c; //int로 캐스팅하면 아스키코드로 변환한다
        }
        return sum;
    }


    static int hashIndex(int value){
        return value % CAPACITY;
    }

}
