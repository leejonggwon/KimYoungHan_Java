package collection.list;

public class BatchProcessor {

    //private final MyLinkedList<Integer> list = new MyLinkedList<>(); //추상적인것을 의존하는것으로 바꾼다
    private final MyList<Integer> list; //어떤 MyList의 구현체를 선택할 지는 실행 시점에 생성자를 통해서 결정한다

    //생성자를 통해서 MyList 구현체 전달된다 //의존성 주입
      //new BatchProcessor(new MyArrayList())
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            list.add(0,i); //앞에 추가 //[0] → [1, 0] → [2, 1, 0] → [3, 2, 1, 0] → [4, 3, 2, 1, 0]
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " +  size + ", 계산 시간: " + (endTime - startTime) +"ms");
    }
}















