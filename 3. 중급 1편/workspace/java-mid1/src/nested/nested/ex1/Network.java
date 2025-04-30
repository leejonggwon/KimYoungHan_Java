package nested.nested.ex1;

public class Network {

    public void sendMessage(String text){
        System.out.println("sendMessage() 실행");
        //Network 클래스안에서만 networkMessage 사용 된다고 가정한다

        //생성자 호출이 되면 → NetworkMessage 생성자 실행 출력
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
