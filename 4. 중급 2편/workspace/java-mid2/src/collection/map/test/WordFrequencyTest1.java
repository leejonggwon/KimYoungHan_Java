package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        //Q. 각각의 단어가 나타난 수를 출력해라

        String text = "orange banana apple apple banana apple";

        // 코드 작성

        Map<String, Integer> map = new HashMap<>(); //단어와 단어수를 저장할 Map

        //split(): 입력받은 특정문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴한다
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words)); //[orange, banana, apple, apple, banana, apple]
        System.out.println();

        for (String word : words) {
            //System.out.print(word + " ");

            Integer count = map.get(word); //Map 안에 해당 단어의 등장 횟수(value)를 가져옴.
            if (count == null) { //null 이면 0으로 초기화 하고 1로 해야한다
                count = 0;
            }
            count++;

            map.put(word, count);
            System.out.println("map 내부 상황 : " + map);
        }
        System.out.println(map);
    }
}
