package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data); //null 참조값

        //NullPointerException 예외 발생함
        System.out.println("bigData.data.value= " + bigData.data.value); //null.value와 같음
    }
}