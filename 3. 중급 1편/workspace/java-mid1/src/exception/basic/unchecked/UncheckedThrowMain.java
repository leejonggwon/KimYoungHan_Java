package exception.basic.unchecked;

public class UncheckedThrowMain {

    public static void main(String[] args) {

        Service service = new Service();
        service.callThrow(); //예외처리 않고 밖으로 던진다

        System.out.println("정상 종료");
    }
}
