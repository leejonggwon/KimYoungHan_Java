package generic.ex2;

public class Box<T> { //동물을 담을수 있는 Box

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
