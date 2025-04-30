package exception.ex0;
//NetworkClient 사용 로직을 처리한다
public class NetworkServiceV0 {

    public void sendMessage(String data){
        String address = "http://example.com"; //접속할 외부 서버주소
        NetworkClientV0 client = new NetworkClientV0(address); //NetworkClient 생성, 접속할 외부 서버주소 전달

        client.connect();    //연결 호출
        client.send(data);   //메세지 전송
        client.disconnect(); //종료
    }

}
