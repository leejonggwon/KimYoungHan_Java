package genegic.ex1;

public class IntegerBox {
    //숫자를 보관하는 박스

    private Integer value;

    //숫자보관
    public void set(Integer value){
        this.value = value;
    }

    //숫자꺼내는
    public Integer get(){
        return value;
    }

}
