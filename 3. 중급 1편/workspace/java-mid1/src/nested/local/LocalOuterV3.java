package nested.local;

import java.lang.reflect.Field;
//지역 변수 캡처
public class LocalOuterV3 {

    private int outInstanceVar = 3;

    //메서드
    //Printer를 반환한다
    public Printer process(int paramVar){
        int localVar = 1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다

        //메스드안 클래스
        class LocalPrinter implements Printer{
            int value = 0; //인스턴스변수

            @Override
            public void print() {
                System.out.println("value= " + value); //인스턴스변수
                //인스턴스는 지역 변수보다 더 오래 살아남는다
                System.out.println("localVar= " + localVar); //지역변수
                System.out.println("paramVar= " + paramVar); //매개변수
                System.out.println("outInstanceVar= " + outInstanceVar); //바깥클래스 접근(지역클래스도 내부 클래스의 한 종류이다)
            }
        }
        LocalPrinter printer = new LocalPrinter(); //인스턴스 생성된다
        //printer.print();를 여기서 실행하지 않고 Printer 인스턴스만 반환한다
        return printer;
    }



    //메인메서드
    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2); //반환한것을 printer에서 받았음
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행한다
        printer.print();
        System.out.println("----------");


        //추가(캡쳐변수 확인)
        System.out.println("필드 확인");
        //getClass(): printer에 대한 클래스 정보
        //getDeclaredFields(): 선언한 필드정보를 얻을수 있음
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
            //인스턴스 변수
            //field = int nested.local.LocalOuterV3$1LocalPrinter.value

            //캡쳐번수 //자바가 내부적으로 캡쳐를 해서 필드를 만들어 넣은것을 확인 할 수 있음
            //field = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
            //field = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar

            //바깥 클래스 참조하기 위한 필드
            //field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0
        }
    }
}
