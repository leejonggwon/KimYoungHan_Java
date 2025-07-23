package collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer>{ //내 클래스는 반복 가능한 객체 라고 자바에게 알려주는것과 같다

    private int[] numbers;

    //생성자
    public MyArray(int[] numbers){
        this.numbers = numbers;
    }


    //반복을 시작할 때 사용할 "반복기(iterator)"를 만들어서 반환해주는 메서드
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers); //number 배열을 넣어서, 데이터를 반복할 수 있게 만들어주는 반복자를 리턴
    }

}
