package collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10; //저장할 수 있는 배열의 크기

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));   //1
        System.out.println("hashIndex(2) = " + hashIndex(2));   //2
        System.out.println("hashIndex(5) = " + hashIndex(5));   //5
        System.out.println("hashIndex(8) = " + hashIndex(8));   //8
        System.out.println("hashIndex(14) = " + hashIndex(14)); //4
        System.out.println("hashIndex(99) = " + hashIndex(99)); //9

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);  //inputArray[1] = 1
        add(inputArray, 2);  //inputArray[2] = 2
        add(inputArray, 5);  //inputArray[5] = 5
        add(inputArray, 8);  //inputArray[8] = 8
        add(inputArray, 14); //inputArray[4] = 14
        add(inputArray, 99); //inputArray[9] = 99
        System.out.println("inputArray = " + Arrays.toString(inputArray)); //[null, 1, 2, null, 14, 5, null, null, 8, 99]

        //검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);                     //해시인덱스값을 구한다
        System.out.println("searchValue hashIndex = " + hashIndex); //4
        Integer result = inputArray[hashIndex];                     //O(1) //배열에 해시 인덱스를 대입해서 값을 조회한다
        System.out.println(result);                                 //14
    }


    //해시인덱스의 위치에 데이터를 저장한다
    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
        //inputArray[hashIndex(value)] = value; //해시인덱스로 변환한 인덱스에 값을 입력한다
    }

    //해시인덱스 반환
    static int hashIndex(int value){
        return value % CAPACITY;
    }

}
