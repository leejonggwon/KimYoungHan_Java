package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {

        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); //error2
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }finally { //반드시 호출해야 하는 마무리 흐름, 잡을수없는 예외도 호출된다
            client.disconnect();
        }
    }
}
