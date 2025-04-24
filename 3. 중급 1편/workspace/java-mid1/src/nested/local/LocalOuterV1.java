package nested.local;

public class LocalOuterV1 {

    //바깥 인스턴스 변수
    private int outInstanceVar = 3;

    //메서드
    public void process(int paramVar){
        int localVar = 1; //지역변수

        //메스드안 클래스
        class LocalPrinter{
            int value = 0; //클래스의 멤버변수

            public void printData(){
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar); //지역변수에도 접근 할 수 있음
                System.out.println("paramVar= " + paramVar); //매개변수에도 접근
                System.out.println("outInstanceVar = " + outInstanceVar); //바깥클래스 접근(지역클래스도 내부 클래스의 한 종류이다)
            }
        }

        LocalPrinter printer = new LocalPrinter(); //인스턴스 생성된다
        printer.printData();
    }

    //메인메서드
    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }

}
