package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        //Ctrl+Alt+V: 변수만들어줌
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count= " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count= " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count= " + counter.count);
        //count인스턴스를 공용으로 사용하기 때문에 누적이 된다
    }
}
