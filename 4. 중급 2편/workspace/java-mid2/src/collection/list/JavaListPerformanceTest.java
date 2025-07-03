package collection.list;

import java.util.ArrayList;  //자바리스트
import java.util.LinkedList; //자바리스트
import java.util.List;       //자바리스트

public class JavaListPerformanceTest {
    public static void main(String[] args) {

        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFrist(new ArrayList<>(), size); //자바가 고속복사로 제공하므로 더 빠르다(10배이상)
        addMid(new ArrayList<>(), size);  //찾는데 O(1), 데이터 추가(밀기) O(n)

        ArrayList<Integer> arrayList = new ArrayList<>(); //조회용 데이터로 사용
        addLast(arrayList, size); //찾는데 O(1), 데이터 추가(밀기없음) 0(1)
        System.out.println();

        System.out.println("==LinkedList 추가==");
        addFrist(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);  //찾는데 O(n), 데이터 추가 O(1)

        LinkedList<Integer> linkedList = new LinkedList<>(); //조회용 데이터로 사용
        addLast(linkedList, size); //마지막노드를 알고 있으므로 뒤에 추가가 빠르다
        System.out.println();


        int loop = 10000;
        System.out.println("==ArrayList 조회==");
        getIndex(arrayList, loop,0); //앞에서 조회
        getIndex(arrayList, loop,size / 2); //중간에서 조회
        getIndex(arrayList, loop,size - 1); //마지막에서 조회
        System.out.println();

        System.out.println("==LinkedList 조회==");
        getIndex(linkedList, loop,0); //앞에서 조회
        getIndex(linkedList, loop,size / 2); //중간에서 조회
        getIndex(linkedList, loop,size - 1); //마지막에서 조회
        System.out.println();


        System.out.println("==ArrayList 검색==");
        search(arrayList, loop,0); //앞에서 조회
        search(arrayList, loop,size / 2); //중간에서 조회
        search(arrayList, loop,size - 1); //마지막에서 조회
        System.out.println();

        System.out.println("==LinkedList 검색==");
        search(linkedList, loop,0); //앞에서 조회
        search(linkedList, loop,size / 2); //중간에서 조회
        search(linkedList, loop,size - 1); //뒤에서 부터 찾기 떄문에 속도가 빠름
        System.out.println();
    }


    //인덱스0에 값을 추가
    private static void addFrist(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            list.add(0, i); //인덱스 0에서 i를 계속 추가한다
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }


    //가운데 지점에 추가
    private static void addMid(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            list.add(i / 2, i); //인덱스1에서 2가추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }


    //처음 추가
    private static void addLast(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            list.add(i); //마지막에 데이터 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //조회
    private static void getIndex(List<Integer> list, int loop, int index){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime-startTime) + "ms");
    }

    //검색
    private static void search(List<Integer> list, int loop, int findValue){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime-startTime) + "ms");
    }
}


