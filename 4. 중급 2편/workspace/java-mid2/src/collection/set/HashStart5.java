package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];    //LinkedList<Integer>을 넣을 수 있는 배열을 생성
        System.out.println("buckets = " + Arrays.toString(buckets)); //[null, null, null, null, null, null, null, null, null, null]

        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>(); //buckets 배열 안에 LinkedList 객체를 하나씩 생성하고 입력
        }
        System.out.println("buckets = " + Arrays.toString(buckets)); //[[], [], [], [], [], [], [], [], [], []]

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);//99와 중복
        System.out.println("buckets = " + Arrays.toString(buckets)); //[[], [1], [2], [], [14], [5], [], [], [8], [999, 9]]


        //조회
        System.out.println("조회: " + buckets[9].get(0));
        //수정
        System.out.println("수정: " + buckets[9].set(0, 999));
        System.out.println("수정된 값 확인 buckets = " + Arrays.toString(buckets));


        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);
    }


    //추가
    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value); //해시인덱스

        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1) //bucket은 buckets[9]에 있는 연결 리스트의 참조
        if(!bucket.contains(value)){  //중복체크 O(n)
            bucket.add(value);        //[19]
        }
    }

    //검색
    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1) //[19, 9] //bucket은 연결리스트
        return bucket.contains(searchValue);             //O(n) //LinkedList 있는것을 하나씩 뒤진다

    }

    //해시인덱스 구하기
    static int hashIndex(int value){
        return value % CAPACITY;
    }


}
