package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};
        //Set: 중복제거해서 출력, 순서상관 없다
        Set<Integer> set = new HashSet<>();

        for (Integer s : inputArr) {
            set.add(s); //set 이 알아서 중복제거를 한다
        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}

