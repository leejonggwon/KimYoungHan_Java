package extend1.overriding;

public class ElectricCar extends Car {

    //오버라이딩(재정의)
    @Override
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge(){
        System.out.println("충전합니다");
    }
}
