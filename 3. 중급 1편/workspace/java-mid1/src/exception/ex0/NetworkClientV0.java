package exception.ex0;

public class NetworkClientV0 {

    private final String address; //접속할 외부 서버 주소

    //생성자
    public NetworkClientV0(String address) {
        this.address = address;
    }

    //외부서버에 연결한다
    public String connect(){
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    //연결한 외부 서버에 데이터를 전송한다
    public String send(String data){
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    //외부 서버와 연결을 해제한다
    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }
}
