package exception.basic.checked;

public class Service {

    Client client = new Client();

    /** 예외를 잡아서 처리하는 코드 */
    public void callCatch(){
        try{
            client.call(); //Service에서 Client 호출
        } catch (MyCheckedException e){ //try 안에서 예외가 터지면, catch 에서 MyCheckedException를 잡을 수 있다
                 //Exception = MyCheckedException //자식이므로 들어갈수 있다
            //예외 처리 로직
            System.out.println("예외 처리, message= " + e.getMessage()); //MyCheckedException에 보관한 message 꺼낼 수 있다
        }
        //처리 후 정상흐름으로 바뀐다
        System.out.println("정상 흐름");
    }

    /** 체크 예외를 밖으로 던지는 코드
     *  체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다. */
    public void catchThrow() throws MyCheckedException { //해결 못해서 나를 호출한곳 으로 던지는 코드

        client.call();

    }
}
