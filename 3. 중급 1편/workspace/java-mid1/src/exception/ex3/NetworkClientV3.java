package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    //생성자
    public NetworkClientV3(String address) {
        this.address = address;
    }

    //예외 그 자체로 어떤 오류가 발생했는지 알 수 있다
    public void connect() throws ConnectExceptionV3 { //체크 예외 던진다
        if(connectError){
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }


    public void send(String data) throws SendExceptionV3 {
        if(sendError){
            throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패: " + data); //catch에서 잡을 수 없는 에러, 언체크 예외가 터졌다고 가정
            //throw new RuntimeException("ex");
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }


    //외부 서버와 연결을 해제한다
    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    //에러생성
    public void initError(String data){
        if (data.contains("error1")){ //전송할 문자에 "error1"이라는 단어가 있으면 connectError = true로 활성화한다
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }
}
