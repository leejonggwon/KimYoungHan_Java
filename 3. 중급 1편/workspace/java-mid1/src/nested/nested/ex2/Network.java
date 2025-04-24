package nested.nested.ex2;

public class Network {

    public void sendMessage(String text){

        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    //NetworkMessage 클래스를 Network 클래스 안에 중첩해서 만들었다
    private static class NetworkMessage {

        private  String content;

        //생성자
        public NetworkMessage(String content) {
            this.content = content;
            System.out.println("NetworkMessage 생성자 실행");
        }

        public void print(){
            System.out.println("print() 실행: " + content);
        }
    }

}
