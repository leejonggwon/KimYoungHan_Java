package collection.link;

public class MyLinkedListV2 {

    private Node first; //Node는 사용자정의 자료형 //item, next
    private int size = 0;


    //마지막에 데이터를 추가한다
    public void add(Object e){
        Node newNode = new Node(e); //새로운 노드 생성
        if (first == null){
            first = newNode; //first에 새로운 노드 넣는다
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode; //마지막 노드를 찾아 연결한다
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

    //추가 코드
    //데이터 추가
    public void add(int index, Object e){
        Node newNode = new Node(e);
        if(index == 0){           //인덱스가 첫번째 경우
            newNode.next = first; //first 가 참조하는 값을 newNode.next 에 연결한다
            first = newNode;      //first 에 newNode 를 연결한다
        } else{ //중간, 뒤부분인 경우
            Node prev = getNode(index - 1); //직전노드 찾기
            newNode.next = prev.next;             //직전노드의 next가, 내노드의 next가 된다
            prev.next = newNode;                  //직전노드의 next에 새노드를 연결한다
        }
        size++;
    }




    //특정 인덱스에 데이터를 찾아 변경한다
    public Object set(int index, Object element){
        Node x = getNode(index); //인덱스에 대한 노드를 찾아온다
        Object oldValue = x.item; //이전 아이템 꺼낸서 저장하고 반환용
        x.item = element; //값을 넣는다
        return oldValue;
    }


    //추가코드
    //데이터 삭제
    public Object remove(int index){
        Node removeNode = getNode(index);     //삭제할 노드 찾기
        Object removedItem = removeNode.item; //삭제한값
        if(index ==0 ){
            first = removeNode.next;  //first에 삭제할 노드의 next를 참조한다
        }else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next; //이전 노드 next에 삭제할 노드의 next를 참조한다
        }
        removeNode.item = null; //초기화한다
        removeNode.next = null; //초기화한다
        size--;
        return removedItem; //삭제한값 반환
    }


    //해당 인덱스의 값을 찾기
    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }


    //인덱스에 관한 노드를 찾아온다
    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) { //index 이전까지 돌린다
            x = x.next;
        }
        return x;
    }

    //검색해서 몇 번째 인덱스에 있는지
    public int indexOf(Object o){
        int index = 0;
        for (Node x = first; x != null; x = x.next){ //first 부터, x.next가 null이 아닐때 까지, next추가
            if(o.equals(x.item)){ //들어온값과 x.item값이 같으면 index 반환한다
                return index;
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
        return "MyLinkedListV2{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}













