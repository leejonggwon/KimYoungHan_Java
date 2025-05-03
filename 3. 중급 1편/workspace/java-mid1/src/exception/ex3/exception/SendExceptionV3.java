package exception.ex3.exception;

//전송에 실패시 발생하는 예외 분류
public class SendExceptionV3 extends NetworkClientExceptionV3{

    private final String sendData; //전송을 시도한 데이터를 보관

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
