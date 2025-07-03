package generic.ex4;

public class GenericMethod{
    //제네릭타입과 제네릭 메서드는 다르다

    //Object 를 받아서 Object 반환하는 메서드
    //static 메서드에 제네릭 메서드 도입할 수 있다
    public static Object objMethod(Object obj){
        System.out.println("Object print: " + obj);
        return obj;
    }

    //제네릭 메서드 정의
    //특정 타입을 받아서 반환하는 메서드
    public static <T> T genericMethod(T t){
        System.out.println("generic print: " + t);
        return t;
    }

    //제네릭 메서드도 제한을 걸 수 있다
    //Number는 int,bouble 이런 숫자들의 부모이다
    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound print: " + t);
        return t;
    }

}
