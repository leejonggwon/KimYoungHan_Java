package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>(); //데이터 추가에 빠름

        BatchProcessor processor = new BatchProcessor(list); //생성자에 list 입력한다
        processor.logic(50_000); //5만
    }
}
