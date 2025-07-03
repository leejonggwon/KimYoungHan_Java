package collection.list;

public class MyLinkedList<E> implements MyList<E> { //제네릭클래스로 선언

    private Node<E> first; //Node는 사용자정의 자료형 //item, next
    private int size = 0;

    //마지막에 데이터를 추가한다
    @Override
    public void add(E e){
        Node<E> newNode = new Node<>(e); //새로운 노드 생성
        if (first == null){
            first = newNode; //first에 새로운 노드 넣는다
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode; //마지막 노드를 찾아 연결한다
        }
        size++;
    }

    //마지막노드 찾기
    private Node<E> getLastNode() {
        Node<E> x = first;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    //추가 코드
    //데이터 추가
    @Override
    public void add(int index, E e){
        Node<E> newNode = new Node<>(e);
        if(index == 0){ //첫번째 경우
            newNode.next = first; //first가 참조하는 값 next에 연결한다
            first = newNode; //first에는 newNode를 연결
        } else{ //중간, 뒤부분인 경우
            Node<E> prev = getNode(index - 1);//직전노드 찾기
            newNode.next = prev.next; //직전노드의 next가, 내노드의 next가 된다
            prev.next = newNode;
        }
        size++;
    }



    //특정 인덱스에 데이터를 찾아 변경한다
    @Override
    public E set(int index, E element){
        Node<E> x = getNode(index); //인덱스에 대한 노드를 찾아온다
        E oldValue = x.item; //이전 아이템 꺼낸서 저장하고 반환용
        x.item = element; //값을 넣는다
        return oldValue;
    }


    //추가코드
    //데이터 삭제
    @Override
    public E remove(int index){
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if(index ==0 ){
            first = removeNode.next;
        }else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null; //내데이터 초기화
        removeNode.next = null;
        size--;
        return removedItem; //삭제한값 반환
    }



    //해당 인덱스의 값을 찾기
    @Override
    public E get(int index){
        Node<E> node = getNode(index);
        return node.item;
    }


    //인덱스에 관한 노드를 찾아온다
    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //검색해서 몇 번째 인덱스에 있는지
    @Override
    public int indexOf(E o){
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next){ //first 부터, x.next가 null이 아닐때 까지, next추가
            if(o.equals(x.item)){ //들어온값과 x.item값이 같으면 index 반환한다
                return index;
            }
            index++;
        }
        return -1; //못찾으면 -1을 반환한다
    }

    @Override
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



    //중첩클래스
    private static class Node<E> { //제네릭타입 E로 결정

        E item; //내부에 저장할 데이터
        Node<E> next;   //Node로 Node를 연결할 참조값

        //생성자
        public Node(E item) {
            this.item = item;
        }

        //[A→B→C] 처럼 toString()을 구현해보기
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(); //루프에서 문자를 더하는 역할
            Node<E> x = this;  //자기 자신을 넣는다
            sb.append("["); //[

            while (x != null) {     //x가 null 이 아닐때 까지 돈다
                sb.append(x.item); //[A
                if (x.next != null) { //x.next가 null이 아니면
                    sb.append(" → "); //[A →
                }
                x = x.next;
            }

            sb.append("]");
            return sb.toString(); //StringBuilder 자체는 문자열이 아니고,문자열로 변환하려면 toString()을 써야 한다
        }
    }



}













