package poly.ex5;

//public class Dog extends InterfaceAnimal {
public class Dog implements InterfaceAnimal{

    //상속과 똑같음
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
