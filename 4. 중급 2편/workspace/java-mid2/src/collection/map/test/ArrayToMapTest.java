package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // Q.다음 예제를 참고해서 2차원 배열의 데이터를 Map<String, Integer>로 변경해라.

        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String, Integer> productMap = new HashMap<>();

        for (String[] product : productArr) { //product에 덩어리로 하나씩 입력이 된다
            // product[0]은 key, product[1]은 value가 된다
            productMap.put(product[0],  Integer.valueOf(product[1])); //문자를 Integer 객체로 숫자로 변환한다

            System.out.println(product[0] + " " + product[1]);
        }

        // Map의 모든 데이터 출력 - 코드 작성
        //KeySet 활용
        for (String key : productMap.keySet()) {
            System.out.println("제품: " + key + ", " + " 가격: " + productMap.get(key));
        }
        System.out.println();


        //entrySet 활용
        //Map 전체를 꺼내서 key랑 value를 한 쌍씩 다루고 싶을 때 사용
        Set<Map.Entry<String, Integer>> entries = productMap.entrySet();
        System.out.println("entries = " + entries); //[Java=10000, JPA=30000, Spring=20000]

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("제품: " + key + ", " + " 가격: " + value);
        }
    }
}
