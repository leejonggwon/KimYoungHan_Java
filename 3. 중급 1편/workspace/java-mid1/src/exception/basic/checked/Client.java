package exception.basic.checked;

public class Client {

    public void call() throws MyCheckedException{  //예외 해결 못하면 예외를 메서드 밖(나를 호출한곳)으로 던진다고 선언한다

        //문제 상황이 발생
        throw new MyCheckedException("ex(예외메세지)");
        //throw: 예외를 터트리는 역할
        //throws: 해결 못해서 메서드 밖으로 던지는 역할

    }
}
