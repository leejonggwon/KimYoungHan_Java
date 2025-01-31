package oop1;

public class ValueData {
    //객체지향: 속성과 기능이 뭉처있음
    //속성(데이터,멤버변수)
    int value;

    //기능(메서드) //static 키워드를 사용하지 않는다
    void add(){
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
