package poly.ex3;

//추상클래스는 생성못함
public abstract class AbstractAnimal {

    //추상메서드(메서드바디 구현못함)
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
