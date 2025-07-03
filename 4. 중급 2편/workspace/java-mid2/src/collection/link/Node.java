package collection.link;

public class Node {

    Object item; //내부에 저장할 데이터
    Node next;   //Node로 Node를 연결할 참조값

    //생성자
    public Node(Object item) {
        this.item = item;
    }

/*
    //Node{item=A, next=Node{item=B, next=Node{item=C, next=null}}}
    //IDE 생성 toString()
    //참조값 대신 문자열로 표현
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
*/

    //[A→B→C] 처럼 toString()을 구현해보기
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //루프에서 문자를 더하는 역할
        Node x = this;  //자기 자신을 넣는다, first, toString()을 실행 중인 그 Node 객체를 가르킨다
        sb.append("["); //[

        while (x != null){     //x가 null 이 아닐때 까지 돈다
            sb.append(x.item); //[A
            if(x.next != null){ //x.next에 값이 있으면
                sb.append(" → "); //[A →
            }
            x = x.next;
        }
        sb.append("]");

        return sb.toString(); //StringBuilder 자체는 문자열이 아니고,문자열로 변환하려면 toString()을 써야 한다
    }
}
