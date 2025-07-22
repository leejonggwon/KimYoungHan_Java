package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<>());       //순서 무작위              A 1 B 2 C
        run(new LinkedHashSet<>()); //입력한 순서대로           C B A 1 2
        run(new TreeSet<>());       //데이터 값을 기준으로 정렬   1 2 A B C
    }

    private static void run(Set<String> set){
        System.out.println("set = " + set.getClass()); // set이 어떤 클래스의 인스턴스인지(즉, 실제 타입이 무엇인지) 알려주는 메서드

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();  //set 안에 들어 있는 요소들을 하나씩 꺼내서 순서대로 반복할 수 있게 해주는 도구(반복자)를 만드는 코드
        while(iterator.hasNext()){                   //iterator.hasNext() → 다음 꺼낼 요소가 있는지 확인한다
            System.out.print(iterator.next() + " "); //iterator.next() → 다음 꺼낼 요소 데이터를 반환한다
        }
        System.out.println();
    }
}
