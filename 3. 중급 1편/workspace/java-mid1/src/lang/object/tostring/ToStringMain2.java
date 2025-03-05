package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1.단순 toString 호출");
        System.out.println(car.toString());
        //car는 toString 오버라이딩 안함

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        //Ctrl + D :복사 붙여넣기
        System.out.println("--------------------");
        System.out.println("2.println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("--------------------");
        System.out.println("3.Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        System.out.println("--------------------");
        //참조값 출력(숫자)
        int i = System.identityHashCode(dog1);
        System.out.println("i = " + i);

        //참조값 출력(16진수)
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);
        
    }

}
