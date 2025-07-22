package collection.deque;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //넣기
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println();


        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만하는 기능)
        System.out.println("stack.peek() = " + stack.peek()); //제일위에 마지막꺼 조회
        System.out.println();


        //스택 요소 꺼내기(후입선출: 뒤에부터 꺼낸다)
        System.out.println("stack.pop() = " + stack.pop()); //3
        System.out.println("stack.pop() = " + stack.pop()); //2
        System.out.println("stack.pop() = " + stack.pop()); //1
        System.out.println(stack);
        System.out.println();
    }
}
