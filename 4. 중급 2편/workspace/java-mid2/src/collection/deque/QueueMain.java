package collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>(); //ArrayDeque가 LinkedList 보다 빠르다
        //Queue<Integer> queue = new LinkedList<>();

        //데이터 넣기 offer()
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);
        System.out.println();

        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println();

        //데이터 꺼내기 poll()
        System.out.println("queue.poll() = " + queue.poll()); //1
        System.out.println("queue.poll() = " + queue.poll()); //2
        System.out.println("queue.poll() = " + queue.poll()); //3
        System.out.println(queue); //다꺼내면 없다

    }
}
