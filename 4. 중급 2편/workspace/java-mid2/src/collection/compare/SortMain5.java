package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<MyUser>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);

        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1); //treeSet 은 들어가는 순간 정렬이 되어 있다
        System.out.println();

        //따로 정렬기준을 주고 싶을때 //new IdComparator()를 기준으로 트리노드를 비교해서 만든다
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
        System.out.println();

        TreeSet<MyUser> treeSet3 = new TreeSet<>(new IdComparator().reversed());
        treeSet3.add(myUser1);
        treeSet3.add(myUser2);
        treeSet3.add(myUser3);
        System.out.println("IdComparator.reversed 정렬");
        System.out.println(treeSet3);

    }
}
