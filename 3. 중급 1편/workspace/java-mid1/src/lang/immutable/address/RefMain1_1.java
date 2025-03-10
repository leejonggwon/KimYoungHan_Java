package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.

        Address a = new Address("서울");
        Address b = a; //a와 b는 같은 참조값을 본다
        // 참조형 변수는 참조값을 통해 같은 객체를 공유할 수 있다

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("----------");

        b.setValue("부산"); //b의 값을 부산으로 변경해야함
        System.out.println("부산 → b");
        System.out.println("a = " + a); //a의 값도 부산으로 변경됨
        System.out.println("b = " + b);



    }
}
