package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>(); //LinkedList 로도 사용할 수 있음, ArrayDeque 가 더 빠르다

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2); //앞에서 2 넣기
        System.out.println(deque);
        deque.offerLast(3);  //뒤에서 3 넣기
        System.out.println(deque);
        deque.offerLast(4);  //뒤에서 4 넣기
        System.out.println(deque); //[2, 1, 3, 4]
        System.out.println();

        // 다음 꺼낼 데이터 확인 (꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());
        System.out.println();

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); //앞에서 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());   //뒤에서 꺼내기
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);


    }
}
