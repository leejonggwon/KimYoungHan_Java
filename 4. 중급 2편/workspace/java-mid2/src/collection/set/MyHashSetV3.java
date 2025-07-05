package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    //배열선언 //Object 이므로 모든 타입을 넣을 수 있다
    private LinkedList<E>[] buckets;

    private int size = 0; //전체데이터
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    //생성자
    public MyHashSetV3() {
        initBuckets();
    }

    //capacity 값을 받는 생성자
    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }


    //배열생성, LinkedList 생성 공통코드
    private void initBuckets() {
        buckets = new LinkedList[capacity];  //배열생성
        for (int i = 0; i < capacity; i++) { //배열에 LinkedList생성
            buckets[i] = new LinkedList<>();
        }
    }


    //값을 추가
    public boolean add(E value){
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)){
            return false;
        }
        bucket.add(value); //추가
        size++;
        return true;
    }


    //포함되어 있는지 확인하는 검색기능
    public boolean contains(E searchValue){
        int hashIndex = hashIndex(searchValue);         //O(1)
        LinkedList<E> bucket = buckets[hashIndex]; //O(1)
        return bucket.contains(searchValue);            //O(n) → 0(1)
    }


    //특정값 삭제
    public boolean remove(E value){
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value); //Object 타입이 들어오면 그대로 지울수 있다
        if(result){
            size--;
            return true;
        }else {
            return false;
        }
    }


    //hashIndex 계산
    private int hashIndex(E value){
        return Math.abs(value.hashCode()) % capacity; //Math.abs() 절대값으로 해야하므로
    }


    //사이즈
    public int getSize(){
        return size;
    }


    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
