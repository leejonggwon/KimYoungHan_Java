package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();
        //Deque 는 Stack 과 Queue 역할을 모두 수행한다

        //데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);
        System.out.println();

        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());
        System.out.println();

        //데이터 꺼내기
        System.out.println("deque.poll() = " + deque.poll()); //1
        System.out.println("deque.poll() = " + deque.poll()); //2
        System.out.println("deque.poll() = " + deque.poll()); //3
        System.out.println(deque);

    }
}
