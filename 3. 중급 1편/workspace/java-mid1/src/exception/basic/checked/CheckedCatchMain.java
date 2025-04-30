package exception.basic.checked;

public class CheckedCatchMain {

    public static void main(String[] args) {

        Service service = new Service();

        service.callCatch(); //예외를 잡아서 처리하는 코드
        System.out.println("정상 종료 (callCatch)");
    }
}
