package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변(값을 못바꾼다) 컬렉션
        List<Integer> list = List.of(1, 2, 3);
        //list.add(1); //불변이므로 변경이 불가하다(예외터진다)
        //list.set(1, 10);

        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1,"one", 2,"two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list.getClass() = " + list.getClass()); //class java.util.ImmutableCollections$ListN //불변리스트의 클래스

        //list.add(4); //java.lang.UnsupportedOperationException 예외발생
    }
}
