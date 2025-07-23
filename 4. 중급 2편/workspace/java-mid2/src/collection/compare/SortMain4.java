package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);


        //list 에 넣는다
        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);
        System.out.println();


        System.out.println("Comparable 기본 정렬");
        list.sort(null); //비교자를 넣을 수 있다, 안쓰면 null 을 사용한다
        //Collections.sort(list); //또 다른 방법
        System.out.println(list);
        System.out.println();


        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
        //Collections.sort(list, new IdComparator()); //또 다른 방법
        System.out.println(list);
        System.out.println();


        System.out.println("IdComparator.reversed 정렬");
        list.sort(new IdComparator().reversed());
        System.out.println(list);
        System.out.println();


    }
}
