package poly.ex3;

public class Dog extends AbstractAnimal{

    //오버라이딩해야함
    //추상메서드를 자식이 구현함
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
