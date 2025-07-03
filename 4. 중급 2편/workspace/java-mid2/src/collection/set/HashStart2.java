package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        //입력: 1, 2, 5, 8
        //[null, 1, 2, null, null, 5, null, null, 8, null]
        Integer[] inputArray = new Integer[10];
        //배열의 값을 인덱스로 사용했다
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8; //8번을 어떻게 찾을까?
        Integer result = inputArray[searchValue]; //O(1)
        System.out.println("result = " + result);

    }
}
