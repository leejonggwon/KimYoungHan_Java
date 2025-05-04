package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        //catch가 없음:
        // 발생하는 예외인 ConnectExceptionV4, SendExceptionV4를 잡아도 해당 오류를 복구 할 수 없으므로 예외를 밖으로 던진다
        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect(); //던지기 전에 실행한다
        }
    }
}
