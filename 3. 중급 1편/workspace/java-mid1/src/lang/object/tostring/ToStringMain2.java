package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1.단순 toString 호출");
        System.out.println(car.toString());
        //Car 인스턴스는 toString()을 재정의 하지 않아서,
        // Object가 제공하는 기본 toString() 메서드를 사용한다.
        //Dog 인스턴스는 toString()을 재정의 한 덕분에 객체의 상태를 명확하게 확인할 수 있다.
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        //Ctrl + D :복사 붙여넣기
        System.out.println("--------------------");
        System.out.println("2.println 내부에서 toString 호출하기");
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

        //참조값 출력(간편하게 보기위해 16진수)
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);

    }

}
