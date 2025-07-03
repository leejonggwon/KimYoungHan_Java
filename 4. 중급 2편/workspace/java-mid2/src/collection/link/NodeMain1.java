package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        //노드 생성하고 연결하기: A → B → C
        Node first = new Node("A"); //item="A", next=null
        System.out.println("first = " + first); //참조값
        System.out.println("first.item = " + first.item);
        System.out.println("first.next = " + first.next);
        System.out.println();

        first.next = new Node("B"); //first가 가지고 있는 next에 B를 연결한다
                                         //first.next.item="B", first.next.next=null
        System.out.println("first.next = " + first.next);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next = " + first.next.next);
        System.out.println();


        first.next.next = new Node("C" );
        System.out.println("first.next.next = " + first.next.next);
        System.out.println("first.next.next.item = " + first.next.next.item);
        System.out.println("first.next.next.next = " + first.next.next.next);
        System.out.println();


        System.out.println("모든 노드 탐색하기");
        System.out.println("first = " + first);                               //[A → B → C]
        System.out.println("first.item = " + first.item);                     //A
        System.out.println("first.next = " + first.next);                     //[B → C]
        System.out.println("first.next.item = " + first.next.item);           //B
        System.out.println("first.next.next = " + first.next.next);           //[C]
        System.out.println("first.next.next.item = " + first.next.next.item); //C
        System.out.println("first.next.next.item = " + first.next.next.next); //null
        System.out.println();


        //모든 노드 탐색하기 
        Node x = first; //첫번쨰 노드
        while ((x != null)) { //first.next.next.next 일떄, null 이므로 중단한다 
            System.out.println(x.item); //first.item  //first.next.item  //first.next.next.item
            x = x.next;
        }
    }
}
