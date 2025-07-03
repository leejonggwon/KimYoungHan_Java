package generic.ex5;

public class Box <T> { //제네릭타입 생성

    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
