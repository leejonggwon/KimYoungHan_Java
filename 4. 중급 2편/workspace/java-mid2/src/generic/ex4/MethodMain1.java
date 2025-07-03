package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;

        //objMethod() 타입이 Object
        Object object = GenericMethod.objMethod(i);
        System.out.println("----------");


        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        //앞에 다이아몬드로 타입을 지정해줘야 반환값이 지정한 타입이 된다
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10); //Number 상한지정
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
        System.out.println("----------");


        //들어오는 값을 통해 타입인자를 추론을 할 수 있으므로 <Integer> 생략 할 수 있다
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i); //숫자 들어오는거 추론하므로 <Integer> 생략해도 된다
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
