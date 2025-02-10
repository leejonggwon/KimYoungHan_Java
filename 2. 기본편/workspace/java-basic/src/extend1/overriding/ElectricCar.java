package extend1.overriding;

public class ElectricCar extends Car {

    //오버라이딩(재정의함), 옵션임(없어도됨,틀리면 컴파일오류냄)
    @Override
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge(){
        System.out.println("충전합니다");
    }
}
