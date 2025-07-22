package collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);
        System.out.println();

        //학생이 없는 경우에만 추가1
        if(!studentMap.containsKey("studentA")){ //studentA가 없으면
            studentMap.put("studentA", 100);
        }
        System.out.println("studentA가 있으면 studentA 출력= "+ studentMap);
        System.out.println();


        //학생이 없는 경우에만 추가하는 방법2
        studentMap.putIfAbsent("studentA", 100);  //studentA가 없는 경우 100을 studentA 에 넣는다 //실행이 안된다
        studentMap.putIfAbsent("studentB", 100);  //studentB가 없는 경우 100을 studentB 에 넣는다
        System.out.println(studentMap);


    }
}
