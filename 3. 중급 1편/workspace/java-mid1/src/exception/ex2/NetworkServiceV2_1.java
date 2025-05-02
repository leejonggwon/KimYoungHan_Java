package exception.ex2;

//NetworkClient2 사용 로직을 처리하는 역할
public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 { ////예외 던진다

        String address = "http://example.com"; //접속할 외부 서버주소

        NetworkClientV2 client = new NetworkClientV2(address); //NetworkClient 생성, 접속할 외부 서버주소 전달
        client.initError(data); //Error를 초기화 해준다

        //NetworkClient2에서 체크예외가 전달된다, 예외를 잡거나 던진다
        //던진다: Alt + Enter → Add exception to method signature
        client.connect();    //연결
        client.send(data);   //메세지
        client.disconnect(); //종료
    }

}
