package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //꺼내는 타입이 Integer 이므로, Objet → Integer 다운캐스팅
                                                      //Inline Variable: Ctrl + Alt + N
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Objet → String 다운캐스팅
        System.out.println("str = " + str);

        //문제발셍) 잘못된 타입의 인수 전달시
        integerBox.set("문자100"); //integerBox에 "문자100" 문자를 입력
        Integer result = (Integer) integerBox.get(); //String → Integer 캐스팅 예외 발생 //반환타입이 맞지 않는 문제
        System.out.println("result = " + result);
    }
}
