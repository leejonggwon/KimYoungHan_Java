package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        //try-with-resouce 사용 방법
        try(NetworkClientV5 client = new NetworkClientV5(address)) {  //try 괄호안 사용할 자원을 명시한다
            //client의 코드범위는 try내에서만 적용한다
            client.initError(data);
            client.connect();
            client.send(data);
            //try 빠져나가면 AutoCloseable → close() 호출해서 자원해제 한다
        } catch (Exception e){ //예외잡아 예외메시지를 출력하고 throw를 사용해서 다시 밖으로 던진다
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e; //예외던진다
        }
    }
}
