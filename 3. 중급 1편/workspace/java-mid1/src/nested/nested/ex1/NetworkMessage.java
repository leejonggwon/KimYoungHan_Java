package nested.nested.ex1;
// Network 객체 안에서만 사용된다
public class NetworkMessage {

    private  String content;

    //생성자
    public NetworkMessage(String content) {
        this.content = content;
        System.out.println("NetworkMessage 생성자 실행");
    }

    //메서드
    public void print(){
        System.out.println("print() 실행: " + content);
    }
}
