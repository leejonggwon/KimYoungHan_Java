package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();

        //작업을 넣기
        printQueue.offer("doc1");
        printQueue.offer("doc2");
        printQueue.offer("doc3");

        //작업 꺼내서 출력하기
        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
    }
}
