package oop1;

public class ValueData {
    //속성(멤버변수)
    int value;

    //기능(메서드) //static 키워드를 사용하지 않는다
    void add(){
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
