package exception.ex1;


//NetworkClient 사용 로직을 처리한다
public class NetworkServiceV1_1 {

    public void sendMessage(String data){
        String address = "http://example.com"; //접속할 외부 서버주소
        NetworkClientV1 client = new NetworkClientV1(address); //NetworkClient 생성, 접속할 외부 서버주소 전달
        client.initError(data); //Error를 초기화 해준다

        client.connect();    //연결 호출
        client.send(data);   //메세지 전송
        client.disconnect(); //종료
    }

}
