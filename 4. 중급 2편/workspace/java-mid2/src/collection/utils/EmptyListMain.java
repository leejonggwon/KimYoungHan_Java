package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println("list1.getClass() = " + list1.getClass());
        System.out.println("list2.getClass() = " + list2.getClass());

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바5
        List<Integer> list4 = List.of(); //자바9

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        Integer[] arr = {1,2,3,4,5};
        List<Integer> arrList = Arrays.asList(arr); //Arrays.asList(): 크기변경은 못해도 속성은 변경가능하다
        arrList.set(0, 100); //0번을 100으로 바꿨다
        //arrList 뿐만아니라 arr 값도 같이 바뀌었다: arrList이 바뀌면 참조인 arr도 자동으로 값이 변경된다
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);



    }
}
