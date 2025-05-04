package exception.ex4.exception;

//연결에 실패시 발생하는 예외 분류
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

    private final String address; //어느 서버에 연결을 실패했는지 서버의 주소를 넣어둔다

    //생성자
    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    //조회
    public String getAddress() {
        return address;
    }
}
