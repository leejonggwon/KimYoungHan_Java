package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //put 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println("studentMap= " + studentMap); //key=value식으로 출력, HashMap 은 순서를 보장하지 않는다
        System.out.println();


        //get 특정 학생의 값 조회
        Integer result = studentMap.get("studentD"); //키에 연결된 값을 반환한다
        System.out.println("studentMap.get(\"studentD\")= " + result);
        System.out.println();


        System.out.println("KeySet 활용");
        Set<String> KeySet = studentMap.keySet(); // 키들만 반환한다, Set 자료구조형태로 반환한다(중복X, 순서보장X 이므로)
        System.out.println("studentMap.keySet()= " + KeySet); //[studentB, studentA, studentD, studentC]
        System.out.println();

        for (String key : KeySet) {
            Integer value = studentMap.get(key); //키에 연결된 value 값
            System.out.println("key= " + key + ", value= " + value);
        }
        System.out.println();


        //key,value 을 묶을것을 조회
        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        System.out.println("studentMap.entrySet()= " + entries); //[studentB=80, studentA=90, studentD=100, studentC=80]
        System.out.println();

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey(); //entry: key, value 저장하는 객체
            Integer value = entry.getValue();
            System.out.println("key= " + key + ", value= " + value);
        }
        System.out.println();


        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values(); //studentMap 의 value 만 출력한다, values는 중복될 수 있는 집합이므로 Collection 타입으로 반환한다
        System.out.println("values= " + values); //[80, 90, 100, 80]
        System.out.println();

        for (Integer value : values) {
            System.out.println("value= " + value);
        }



    }
}
