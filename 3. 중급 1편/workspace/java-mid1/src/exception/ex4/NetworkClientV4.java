package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    //생성자
    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect()  {
        if(connectError){
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if(sendError){
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
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
        if (data.contains("error1")){
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }
}
