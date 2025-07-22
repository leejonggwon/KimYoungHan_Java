package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        //코드 작성

        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) { //map1을 돌려서 map2와 key가 같은거를 찾는다
            if (map2.containsKey(key)){                         //map1의 키와 map2의 키가 있으면
                result.put(key, map1.get(key) + map2.get(key)); //key와 value값을 더한다
            }
        }
        System.out.println(result);
    }
}
