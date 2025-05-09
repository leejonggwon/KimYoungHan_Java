package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){

        int localVar = 1;

        //익명 클래스는 클래스의 본문을 정의하면서 동시에 생성한다
        //new 다음에 상속받으면서 구현 할 부모타입을 입력한다
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        };

        printer.print(); //생성되어 있으므로 호출할 수 있음
        System.out.println("printer.class= " + printer.getClass());
    }


    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }

}
