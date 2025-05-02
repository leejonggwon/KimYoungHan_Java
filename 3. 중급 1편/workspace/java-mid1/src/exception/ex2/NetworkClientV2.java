package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    //생성자
    public NetworkClientV2(String address) {
        this.address = address;
    }

    //외부서버에 연결
    //반환값 void로 처리한다
    public void connect() throws NetworkClientExceptionV2 { //체크 예외 던진다
        if(connectError){
            //connectError가 true 경우
            //연결실패시 예외발생 //예외가 던져지면 예외를 통해 실패를 확인할 수 있다
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        //연결성공
        System.out.println(address + " 서버 연결 성공");
    }


    //연결한 외부 서버에 데이터를 전송
    public void send(String data) throws NetworkClientExceptionV2 {
        if(sendError){
            //throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송: " + data);
            throw new RuntimeException("ex"); //catch에서 잡을 수 없는 에러, 언체크 예외가 터졌다고 가정
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
