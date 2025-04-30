package exception.ex1;


//NetworkClient 사용 로직을 처리한다
public class NetworkServiceV1_2 {

    public void sendMessage(String data){
        String address = "http://example.com"; //접속할 외부 서버주소
        NetworkClientV1 client = new NetworkClientV1(address); //NetworkClient 생성, 접속할 외부 서버주소 전달
        client.initError(data); //Error를 초기화 해준다

        String connectResult = client.connect(); //연결성공실패 반환값 문자열

        //연결에 실패하면 데이터를 전송하지 않는다
        //결과가 성공이 아니다 → 오류다.
        //if(!connectResult.equals("success")){
        if(isError(connectResult)){ //메서드추출
            System.out.println("[네트워크 오류 발생] 오류코드: " + connectResult); //오류로그를 남긴다
            return ; //문제가 생기는 반환 (메서드 종료), 연결에 실패하면 데이터를 전송하지 않는다
        }

        String sendResult = client.send(data); //메세지 전송
        if(isError(sendResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }

        client.disconnect(); //종료
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

}
