package extend1.ex2;

//상속
public class ElectricCar extends Car {
//Car의 기능을 다 물려받기 때문에 move() 사용할 수 있음

    public void charge(){
        System.out.println("충전합니다");
    }
}
