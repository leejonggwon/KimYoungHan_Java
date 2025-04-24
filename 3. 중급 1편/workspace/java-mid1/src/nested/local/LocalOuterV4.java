package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    //메서드
    public Printer process(int paramVar){

        int localVar = 1; //지역변수

        //메스드안 클래스
        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter(); //인스턴스 생성된다
        //만약 localVal의 값을 변경한다면? 다시 캡쳐를 해야 하나?
        //localVar = 10;
        //paramVar = 20;

        return printer;
    }

    //메인메서드
    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();
        System.out.println("----------");

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
