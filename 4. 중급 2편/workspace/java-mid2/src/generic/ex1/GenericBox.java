package generic.ex1;

public class GenericBox<T> { //제네릭 클래스(코드 재사용, 타입안정성)

    //T를 '타입 매개변수'라 한다 → 이후에 Integer, String으로 변할 수 있다
    private T value;

    //T라는 타입을 넣어준다
    public void set(T value){
        this.value = value;
    }

    //반환
    public T get() {
        return value;
    }
}
