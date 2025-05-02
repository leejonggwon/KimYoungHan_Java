package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {

        String address = "http://example.com"; //접속할 외부 서버주소

        NetworkClientV2 client = new NetworkClientV2(address); //NetworkClient 생성, 접속할 외부 서버주소 전달
        client.initError(data);

        //예외를 잡는다
        //try catch: Alt + Enter → Surround with try/catch
        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) { //connect()에서 에러가 터지면 잡는다
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage()); //오류로그 남기기
            return; //반환 //연결이 되고 전송해야한다
        }


        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage()); //오류로그 남기기
            return;
        }

        client.disconnect();
    }

}
