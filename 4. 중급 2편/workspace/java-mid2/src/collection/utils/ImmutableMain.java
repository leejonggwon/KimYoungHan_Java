package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변리스트 생성
        List<Integer> list = List.of(1, 2, 3);
        System.out.println("mutableList.getClass() = " + list.getClass()); //class java.util.ImmutableCollections$ListN

        //불변 → 가변리스트 전환하기
        ArrayList<Integer> mutableList = new ArrayList<>(list); //list 는 Collection 의 자식이므로 입력 할 수 있다
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList); //[1, 2, 3, 4] //4가 추가되는것을 확인할 수 있다
        System.out.println("mutableList.getClass() = " + mutableList.getClass()); //mutableList.getClass() = class java.util.ArrayList

        //가변 → 불변리스트 전환하기
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);

        //java.lang.UnsupportedOperationException 예외 발생
        //unmodifiableList.add(5);

        System.out.println("unmodifiableList class = " + unmodifiableList.getClass());

    }
}
