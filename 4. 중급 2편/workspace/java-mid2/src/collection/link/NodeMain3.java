package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기: A → B → C
        Node first = new Node("A");       //x01 //first는 node를 의미한다
        first.next = new Node("B");       //x02
        first.next.next = new Node("C");  //x03

        System.out.println(first);
        System.out.println();


        System.out.println("모든 노드 탐색하기");
        printAll(first);
        System.out.println();


        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);
        System.out.println();


        System.out.println("특정 index의 노드 조회하기");
        int index = 2; //2번째 index의 노드를 조회해보기
        Node index2Node = getNode(first, index); //노드와 index를 넣는다
        System.out.println("index2Node = " + index2Node);               //[C]
        System.out.println("노드에 있는 값을 조회 = " + index2Node.item);   //C
        System.out.println();


        System.out.println("데이터 추가하기(추가적으로 노드연결하기)");
        add(first, "D");
        System.out.println(first);
        //계속 추가할 수 있다
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }


    //모든 노드 탐색하기
    private static void printAll(Node node) {
        Node x = node; //first
        while (x != null){
            System.out.println(x.item); //first.item //first.next.item ...
            x = x.next;
        }
    }


    //마지막 노드 조회하기
    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null){ //내가 가진 노드의 next가 null 이면 노드의 끝이다
            x = x.next;
        }
        return x; //x.next == null 이면 마지막 노드이다
    }



    //특정 index의 노드 조회하기
    private static Node getNode(Node node, int index) {
        Node x = node;
        for(int i = 0; i < index; i++){
            x = x.next; //first.next //first.next.next //first.next.next
        }
        return x;
    }


    //데이터 추가하기(추가적으로 노드연결하기)
    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node); //마지막노드를 찾고
        lastNode.next = new Node(param);   //마지막노드의 next에 새노드를 연결한다

    }
}
















