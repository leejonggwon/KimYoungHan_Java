package collection.link;

public class NodeMain2 {

    public static void main(String[] args) {
        //노드 생성하고 연결하기: A → B → C
        Node first = new Node("A");        //x01
        System.out.println("first = " + first); //[A]

        first.next = new Node("B"); //x02
        System.out.println("first.next = " + first.next); //[B]

        first.next.next = new Node("C"); //x03
        System.out.println("first.next.next = " + first.next.next); //[C]
        System.out.println();


        System.out.println("연결된 노드 출력하기");
        System.out.println(first); //[A → B → C]
        //Node{item=A, next=02}
        //Node{item=A, next=Node{item=B, next=03}}
        //Node{item=A, next=Node{item=B, next=Node{item=C, next=null}}}

        Node nodeB= first.next;
        System.out.println("nodeB = " + nodeB); //[B → C] B에서 C로 이동
    }
}
