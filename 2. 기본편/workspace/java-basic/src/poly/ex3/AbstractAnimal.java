package poly.ex3;

//추상클래스
public abstract class AbstractAnimal {

    //추상메서드(자식에서 반드시 오버라이딩 해야함)
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
