package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    //메서드
    public void process(int paramVar){
        int localVar = 1; //지역변수

        //메스드안 클래스
        //클래스 이므로 인터페이스도 상속할 수 있다
        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar); //지역변수에도 접근 할 수 있음
                System.out.println("paramVar= " + paramVar); //매개변수에도 접근
                System.out.println("outInstanceVar= " + outInstanceVar); //바깥클래스 접근(지역클래스도 내부 클래스의 한 종류이다)
            }
        }

        LocalPrinter printer = new LocalPrinter(); //인스턴스 생성된다
        printer.print();
    }

    //메인메서드
    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }

}
