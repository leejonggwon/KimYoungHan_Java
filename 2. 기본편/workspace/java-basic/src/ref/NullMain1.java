package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); //null :참조형 변수 가르킬 대상이 없다는 의미

        data = new Data();
        System.out.println("2. data = " + data); //참조값 있음

        data = null;
        System.out.println("3. data = " + data);
    }
}
