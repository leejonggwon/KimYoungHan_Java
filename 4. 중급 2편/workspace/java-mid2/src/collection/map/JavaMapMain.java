package collection.map;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map){
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> KeySet = map.keySet();              //Map 안에 있는 모든 key 값을 Set 형태로 반환
        Iterator<String> iterator = KeySet.iterator();  //KeySet을 순서대로 하나씩 꺼낼 수 있는 Iterator( 컬렉션 안에 있는 여러 데이터를 차례대로 꺼낼 수 있는 '기능'을 가진 객체) 생성

        while (iterator.hasNext()){                     //아직 꺼낼 게 남아있냐?
            String key = iterator.next();               //현재 가리키는 key 하나를 꺼냄 그리고 커서(포인터)가 다음 값으로 자동 이동
            System.out.println(key + "=" + map.get(key) + " ");
        }
        System.out.println();
    }
}
