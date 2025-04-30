package exception.ex1;

public class NetworkClientV1 {

    private final String address; //접속할 외부 서버 주소
    public boolean connectError;
    public boolean sendError;


    //생성자
    public NetworkClientV1(String address) {
        this.address = address;
    }

    //외부서버에 연결한다
    public String connect(){
        if(connectError){
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        //연결 성공시
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }


    //연결한 외부 서버에 데이터를 전송한다
    public String send(String data){
        if(sendError){
            System.out.println(address + " 서버에 데이터 전송 실패 " + data);
            return "sendError";
        }
        //전송 성공시
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    //외부 서버와 연결을 해제한다
    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data){
        if (data.contains("error1")){ //전송할 문자에 "error1"이라는 단어가 있으면 connectError = true로 활성화한다
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }
}
