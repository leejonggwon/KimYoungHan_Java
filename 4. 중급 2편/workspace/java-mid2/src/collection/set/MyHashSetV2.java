package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets; //Object이므로 모든 타입을 넣을 수 있다

    private int size = 0; //전체데이터
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    //생성자
    public MyHashSetV2() {
        initBuckets();
    }

    //capacity 값을 받는 생성자
    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    //배열생성, LinkedList 생성 공통코드
    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }


    //값을 추가
    public boolean add(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value)){
            return false;
        }
        bucket.add(value); //추가
        size++;
        return true;
    }

    //포함되어 있는지 확인하는 검색기능
    public boolean contains(Object searchValue){
        int hashIndex = hashIndex(searchValue); //O(1)
        LinkedList<Object> bucket = buckets[hashIndex]; //O(1)
        return bucket.contains(searchValue); //O(n) → 0(1)
    }

    //특정값 삭제
    public boolean remove(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);
        if(result){
            size--;
            return true;
        }else {
            return false;
        }
    }

    //hashIndex 계산
    private int hashIndex(Object value){
        return Math.abs(value.hashCode()) % capacity;
    }


    //사이즈
    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
