package nested.nested.ex1;

public class Network {

    public void sendMessage(String text){
        System.out.println("sendMessage() 실행");
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();

    }
}
