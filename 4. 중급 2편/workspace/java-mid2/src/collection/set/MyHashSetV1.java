package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    //static 클래스 이름으로 바로 접근 가능, 모든 객체가 이 변수를 공유
    //final 상수

    LinkedList<Integer>[] buckets; //배열선언

    private int size = 0; //전체데이터
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    //생성자
    public MyHashSetV1() {
        initBuckets(); //공통부분
    }

    //capacity 값을 받는 생성자
    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    //배열생성, LinkedList 생성 공통코드
    private void initBuckets() {
        buckets = new LinkedList[capacity];  //배열생성
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>(); //배열안 LinkedList 채워준다
        }
    }


    //값을 추가
    public boolean add(int value){
        int hashIndex = hashIndex(value); //해시인덱스를 찾는다
        LinkedList<Integer> bucket = buckets[hashIndex];  //bucket = LinkedList를 쉽게 가리키기 위한 변수 (참조) //O(1) //나의 바구니를 찾는다
        if (bucket.contains(value)){ //O(n) → O(1)데이터가 1개 또는 2개 정도 들어간다
            return false;
        }
        bucket.add(value); //추가
        size++;
        return true;
    }

    //포함되어 있는지 확인하는 검색기능
    public boolean contains(int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        return bucket.contains(searchValue);//나의 바구니에서 포함되어 있는지 확인 //O(n) → O(1)데이터가 1개 또는 2개 정도 들어간다
    }

    //특정값 삭제
    public boolean remove(int value){
        int hashIndex = hashIndex(value); //해시인덱스 찾는다
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1) //나의 바구니를 찾는다
        boolean result = bucket.remove(Integer.valueOf(value)); //O(n) → O(1)데이터가 1개 또는 2개 정도 들어간다
        //remove(int index) 인덱스로 지운다
        //remove(Object o) 값으로 지운다 (Object 로 변환 해야한다)
        if(result){
            size--;
            return true;
        }else {
            return false;
        }
    }

    //hashIndex 계산
    private int hashIndex(int value){
        return value % capacity;
    }

    //사이즈
    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
