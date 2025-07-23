package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();

        System.out.println("iterator 사용");
        while (iterator.hasNext()){ //true 이면 반복
            Integer value = iterator.next(); //증가된 위치요소를 반환한다
            System.out.println("value = " + value);
        }
        System.out.println();

        //추가
        //iterable 인터페이스를 구현한 객체에 대해서 향상된 for문을 사용할 수 있게 해준다
        System.out.println("for-each 사용");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }


    }
}
