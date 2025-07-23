package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);



        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        System.out.println();

        printAll(set.iterator());
        System.out.println();

        foreach(list);
        System.out.println();

        foreach(set);
        System.out.println();
    }

    //printAll(), foreach() 메서드는 새로운 자료 구조가 추가되어도 해당 자료 구조가 Iterator, Iterable 만 구현하고 있다면 코드 변경 없이 사용할 수 있다
    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("iterable" + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }

    //코드 중복해결
    //Iterator 모두 순회할 수 있으므로 재사용성이 높다
    private static void printAll(Iterator<Integer> iterator){
        System.out.println("iterator = " + iterator.getClass()); //iterator 클래스 정보
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
