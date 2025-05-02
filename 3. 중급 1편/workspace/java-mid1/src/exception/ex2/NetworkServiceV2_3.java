package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {

        String address = "http://example.com"; //접속할 외부 서버주소

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        //정상부분과 예외부분을 명확하게 분리
        //하나의 try 안에 정상흐름을 모두 담았다
        //예외 부분은 catch 블럭에서 해결했다
        try { //정상부분
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) { //예외부분 //예외흐름 처리한다
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage()); //오류로그 남기기
        }
    }
}
