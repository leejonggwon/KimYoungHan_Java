package collection.link;

public class MyLinkedListV1 {

    private Node first;  //첫 노드의 위치를 가리킨다
                         // 같은 패키지 안에서 import없이 사용할 수 있다
    private int size = 0;//자료 구조에 입력된 데이터의 사이즈


    //마지막에 데이터를 추가한다
    public void add(Object e){
        Node newNode = new Node(e); //새로운 노드 생성
        if (first == null){  //최초의 경우
            first = newNode; //first에 새로운 노드 넣는다
        } else {
            Node lastNode = getLastNode(); //마지막 노드를 찾아
            lastNode.next = newNode;       //새노드를 연결한다
        }
        size++;
    }

    //마지막노드 찾기
    private Node getLastNode() {
        Node x = first;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    //특정 인덱스에 데이터를 찾아 변경한다
    public Object set(int index, Object element){
        Node x = getNode(index);  //인덱스에 대한 노드를 찾아온다
        Object oldValue = x.item; //이전 아이템 꺼낸서 저장하고 반환용
        x.item = element;         //값을 넣는다
        return oldValue;
    }

    //해당 인덱스의 값을 찾기
    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }


    //인덱스번호로 노드를 찾아온다
    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //검색해서 몇 번째 인덱스에 있는지
    public int indexOf(Object o){
        int index = 0;
        for (Node x = first; x != null; x = x.next){ //first 부터, x.next가 null이 아닐때 까지, next추가
            if(o.equals(x.item)){      //들어온값과 x.item값이 같으면
                return index;          //index를 반환한다
            }
            index++;
        }
        return -1; //못찾으면 -1을 반환한다
    }


    public int size(){
        return size;
    }


    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}













