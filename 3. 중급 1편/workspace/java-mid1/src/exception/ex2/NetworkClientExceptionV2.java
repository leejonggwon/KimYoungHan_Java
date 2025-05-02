package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{
    //예외도 객체이므로 필드와 메서드를 가질 수 있다

    //어떤 종류의 오류 발생했는지 구분 위해, 예외 안에 오류코드를 보관한다
    private String errorCode; //에러코드 //connectError, sendError


    //생성자 만들기: 생성자 → Exception() → errorCode:String
    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message); //오류메세지 //address + " 서버 연결 실패"
        this.errorCode = errorCode;
    }


    //에러코드 조회
    public String getErrorCode() {
        return errorCode;
    }
}
