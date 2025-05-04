package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

//finally 안해도 자동으로 자원해제가 된다는 의미
public class NetworkClientV5 implements AutoCloseable{

    private final String address;
    public boolean connectError;
    public boolean sendError;

    //생성자
    public NetworkClientV5(String address) {
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

    //implements AutoCloseable → close()
    //try 가 끝나면 자동으로 호출된다
    @Override
    public void close() {
        System.out.println("NetworkClientV5.close, try 끝나면 자동으로 호출된다");
        disconnect(); //서버 연결 해제
    }
}
