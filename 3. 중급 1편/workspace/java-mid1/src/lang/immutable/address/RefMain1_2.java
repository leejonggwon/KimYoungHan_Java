package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {

        //객체를 공유 하지 않음
        Address a = new Address("서울"); //x001
        Address b = new Address("서울"); //x002

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("----------");

        b.setValue("부산");
        System.out.println("부산 → b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
