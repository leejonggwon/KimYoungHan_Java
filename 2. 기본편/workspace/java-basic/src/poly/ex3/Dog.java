package poly.ex3;

public class Dog extends AbstractAnimal{


    //Ctrl + O : 오버라이딩
    //추상메서드를 자식이 반드시 구현해야함
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
