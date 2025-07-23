package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //가장 큰값
        Integer max = Collections.max(list);
        //가장 작은값
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);

        //랜덤하게 리스트에 있는 요소를 섞는다
        Collections.shuffle(list);
        System.out.println("shuffle list = " + list);

        Collections.sort(list); //list.sort(null)가 더 낫다
        System.out.println("sort list = " + list);

        Collections.reverse(list);
        System.out.println("reverse list = " + list);



    }
}







