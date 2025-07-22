package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        //q.같은 키로 다른 데이터를 저장하면 어떻게 될까?

        //학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100); //같은 키에 저장시 기존 값 교체
        System.out.println(studentMap); //100으로 value 바뀜
        System.out.println();

        boolean containsKey = studentMap.containsKey("studentA"); //studentA 키가 있냐?
        System.out.println("containsKey = "+ containsKey);
        System.out.println();

        // 특정 학생의 값 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap); //키로 지우면 값도 포함해서 삭제된다

    }
}
