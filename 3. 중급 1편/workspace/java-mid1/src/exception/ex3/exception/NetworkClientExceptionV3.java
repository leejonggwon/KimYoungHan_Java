package exception.ex3.exception;

//NetworkClient 에서 발생하는 모든 예외는 상속받는다
public class NetworkClientExceptionV3 extends Exception{

    public NetworkClientExceptionV3(String message) {
        super(message);
    }
}
