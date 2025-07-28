package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //ArrayList<Integer>: ArrayList 가 가지는 특수한 기능을 사용하고 싶을때
        list.add(1);
        list.add(2);
        list.add(100);
        list.add(4);
        list.add(5);

        //Collections 는 여러가지 유틸리티 static 메서드를 제공한다
        //가장 큰값
        Integer max = Collections.max(list);
        //가장 작은값
        Integer min = Collections.min(list);

        System.out.println("max = " + max); //5
        System.out.println("min = " + min); //1

        System.out.println("list = " + list); //[1, 2, 100, 4, 5]

        //shuffle(): 랜덤하게 리스트에 있는 요소를 섞는다(카드게임)
        Collections.shuffle(list);
        System.out.println("shuffle list = " + list);

        //오름차순 //list.sort(null)가 더 낫다
        Collections.sort(list);
        System.out.println("sort list = " + list); //[1, 2, 4, 5, 100]

        //뒤집어서 정렬
        Collections.reverse(list);
        System.out.println("reverse list = " + list); //[100, 5, 4, 2, 1]



    }
}







