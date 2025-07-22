package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {

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

            //해당 키(word)가 존재하면 그 값을 반환하고, 없으면 기본값(여기선 0)을 반환해라
            Integer count = map.getOrDefault(word, 0);//word가 없으면 0으로 반환
            count++;
            map.put(word, count);

        }
        System.out.println(map);
    }
}
