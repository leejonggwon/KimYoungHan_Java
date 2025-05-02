package exception.ex2;

//NetworkClient2 사용 로직을 처리한다
public class NetworkServiceV2_4 {

    public void sendMessage(String data) { //던졌다

        String address = "http://example.com"; //접속할 외부 서버주소

        NetworkClientV2 client = new NetworkClientV2(address); //NetworkClient 생성, 접속할 외부 서버주소 전달
        client.initError(data);

        try {
            client.connect();
            client.send(data); //RuntimeException은 catch 대상이 아님, 예외가 밖으로 던져짐
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage()); //오류로그 남기기
        }

        client.disconnect(); //RuntimeException 경우 호출되지 않는다
    }
}
