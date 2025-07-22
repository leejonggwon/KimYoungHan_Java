package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        //코드 작성

        System.out.println(map); //{망고=1000, 사과=500, 바나나=500, 딸기=1000}
        System.out.println();

        List<String> list = new ArrayList<>(); //결과값을 넣은 역할

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1000)) { //getValue()는 entrySet()에서 활용한다
                list.add(entry.getKey()); //entry에 있는 value가 1000 이면 key값이 list에 입력이 된다
            }
        }
        System.out.println(list); //[망고, 딸기]
    }
}
