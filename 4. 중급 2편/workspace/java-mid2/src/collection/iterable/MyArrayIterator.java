package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> { //배열을 반복할 수 있는 반복자를 만든다

    private int currentIndex = -1;
    private int[] targetArr; //접근할 배열


    //내가 순회하고 싶은 배열을 넣어줘야한다
    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    //Iterator를 구현
    //다음 요소가 있는지 확인
    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1; //현재 인덱스가 배열의 마지막 인덱스보다 작을 때만 true를 반환
    }

    //Iterator를 구현
    //다음 요소를 꺼냄
    @Override
    public Integer next() {
        return targetArr[++currentIndex]; //currentIndex 1 증가, 증가된 위치의 요소를 반환
    }
}
