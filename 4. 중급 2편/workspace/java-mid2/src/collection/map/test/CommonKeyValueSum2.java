package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {

        //Map 을 생성할 때 Map.of() 를 사용하면 편리하게 Map을 생성할 수 있다
        //Map.of() 생성한 Map은 불변이다. 내용을 변결할 수 없다
        Map<String, Integer> map1 = Map.of("A",1,"B", 2, "C",3);
        Map<String, Integer> map2 = Map.of("B",4,"C", 5, "D",6);

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
