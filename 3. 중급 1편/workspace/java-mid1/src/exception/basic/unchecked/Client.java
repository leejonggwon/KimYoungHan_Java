package exception.basic.unchecked;

public class Client {

    public void call(){ //UncheckedException는 throws를 생략할 수 있다, 알아서 메서드 밖으로 나간다

        throw new MyUncheckedException("ex(예외메세지)");
    }
}

