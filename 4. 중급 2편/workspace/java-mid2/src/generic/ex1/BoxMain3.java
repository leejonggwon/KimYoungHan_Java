package generic.ex1;

public class BoxMain3 { //제네릭 사용

    public static void main(String[] args) {
        //다이아몬드안에 내가 원하는 타입을 넣는다
        //<Integer> 에서 Integer 를 '타입인자' 라고 한다
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정된다, Generic Box의 T가 Integer가 된다
        integerBox.set(10);
        //integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류가 난다
        Integer integer = integerBox.get(); // Integer 타입 반환 (캐스팅 필요X)
        System.out.println("integer = " + integer);


        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("string = " + str);


        //원하는 모든 타입 사용 가능하다 (객체참조형은 가능, 기본형은 안된다)
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론: 자바 스스로 타입 정보를 추론해서 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>(); //Integer 생략해도 된다

        //정리: 제네릭 코드 재사용, 타입 안정성 가능
    }
}
