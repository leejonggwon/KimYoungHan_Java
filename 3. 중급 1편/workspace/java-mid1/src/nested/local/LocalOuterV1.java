package nested.local;

public class LocalOuterV1 {

    //바깥 인스턴스 변수
    private int outInstanceVar = 3;

    //메서드
    public void process(int paramVar){
        int localVar = 1; //지역변수

        //지역클래스 정의
        //접근제어자 사용할수 없다(private)
        class LocalPrinter{
            int value = 0; //클래스의 멤버변수

            public void printData(){
                System.out.println("value= " + value); //자기자신 멤버변수 접근
                System.out.println("localVar= " + localVar); //지역변수에도 접근
                System.out.println("paramVar= " + paramVar); //매개변수에도 접근
                System.out.println("outInstanceVar = " + outInstanceVar); //바깥클래스 접근(지역클래스도 내부 클래스의 한 종류이다)
            }
        }
        LocalPrinter printer = new LocalPrinter(); //인스턴스 생성
        printer.printData(); //호출
    }


    //메인메서드
    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
