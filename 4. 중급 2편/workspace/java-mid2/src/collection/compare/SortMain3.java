package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        //배열에 넣는다
        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array)); //[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
        System.out.println();

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(array); //아무것도 안넣고 array 만 넣는다
        System.out.println(Arrays.toString(array)); //[MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]
        System.out.println();

        //추가 //id로 정렬
        System.out.println("IdComparator 정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("IdComparator.reversed 정렬");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
        System.out.println();

    }
}
