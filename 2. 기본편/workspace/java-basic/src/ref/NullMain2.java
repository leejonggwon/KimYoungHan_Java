package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //참조값이 없으므로 NullPointerException 예외 발생함
        System.out.println("data = "+ data.value);
    }
}
