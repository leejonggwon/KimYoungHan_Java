package exception.basic.checked;

/** Exception을 상속받은 예외는 '체크 예외'가 된다 :문법으로 정한 규칙 */
public class MyCheckedException extends Exception {

    //생성자 → Exception(message:String)
    public MyCheckedException(String message) {
        super(message); //오류 메세지 보관기능: 오류 메세지를 받아서 부모에 보관한다
                        // Throwable에 있는 detailMessage에 보관된다, getMessage() 통해서 조회할 수 있다
    }
}











