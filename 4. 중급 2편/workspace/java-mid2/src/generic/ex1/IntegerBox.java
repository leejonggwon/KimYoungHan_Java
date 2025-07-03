package generic.ex1;

public class IntegerBox { //Integer 값을 보관하고 꺼내는 박스

    private Integer value;

    //값 저장(Setter)
    public void set(Integer value) {
        this.value = value;
    }

    //값 꺼냄(Getter)
    public Integer get(){
        return value;
    }
}
