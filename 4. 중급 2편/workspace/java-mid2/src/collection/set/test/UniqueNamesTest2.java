package collection.set.test;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr =  {30, 20, 20, 10, 10};
        //List<Integer> list = List.of(inputArr); //배열을 기반으로 list를 만들수 있다

        //중복을 제거하는데 입력한 순서대로
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr)); //생성자에 List를 전달 할 수 있다 //set에 데이터를 넣는방법

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3);

        //배열을 리스트로 변환하기
        // List<Integer> list = Arrays.asList(inputArr);
        // List<Integer> list = List.of(inputArr);
        //편리한 리스트 생성
        // List<Integer> list = Arrays.asList(1, 2, 3);
        // List<Integer> list = List.of(1, 2, 3);

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
