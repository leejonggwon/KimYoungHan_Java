package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {

        int size = 50_000;
        System.out.println("==MyArrayList 추가==");
        addFrist(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);  //찾는데 O(1), 데이터 추가(밀기) O(n)

        MyArrayList<Integer> arrayList = new MyArrayList<>(); //조회용 데이터로 사용
        addLast(arrayList, size); //찾는데 O(1), 데이터 추가(밀기없음) 0(1)
        System.out.println();

        System.out.println("==MyLinkedList 추가==");
        addFrist(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);  //찾는데 O(n), 데이터 추가 O(1)

        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); //조회용 데이터로 사용
        addLast(linkedList, size); //찾는데 O(n), 데이터 추가 O(1)
        System.out.println();


        int loop = 10000;
        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList, loop,0); //앞에서 조회
        getIndex(arrayList, loop,size / 2); //중간에서 조회
        getIndex(arrayList, loop,size - 1); //마지막에서 조회
        System.out.println();

        System.out.println("==MyLinkedList 조회==");
        getIndex(linkedList, loop,0); //앞에서 조회
        getIndex(linkedList, loop,size / 2); //중간에서 조회
        getIndex(linkedList, loop,size - 1); //마지막에서 조회
        System.out.println();


        System.out.println("==MyArrayList 검색==");
        search(arrayList, loop,0);        //앞에서 조회
        search(arrayList, loop,size / 2); //중간에서 조회
        search(arrayList, loop,size - 1); //마지막에서 조회
        System.out.println();

        System.out.println("==MyLinkedList 검색==");
        search(linkedList, loop,0);        //앞에서 조회
        search(linkedList, loop,size / 2); //중간에서 조회
        search(linkedList, loop,size - 1); //마지막에서 조회
        System.out.println();
    }


    //인덱스0 지점에 추가
    private static void addFrist(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            list.add(0, i); //인덱스 0에서 i를 계속 추가한다
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //가운데 지점에 추가
    private static void addMid(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            list.add(i / 2, i); //인덱스1에서 2가추가 //인덱스 위치: 0,0,1,1,2
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //마지막 지점에 추가
    private static void addLast(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            list.add(i); //마지막에 데이터 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    //조회
    private static void getIndex(MyList<Integer> list, int loop, int index){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime-startTime) + "ms");
    }

    //검색
    private static void search(MyList<Integer> list, int loop, int findValue){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime-startTime) + "ms");
    }

}









