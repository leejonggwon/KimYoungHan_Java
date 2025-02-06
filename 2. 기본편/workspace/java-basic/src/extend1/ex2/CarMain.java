package extend1.ex2;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //Car 상속받았기 떄문에 사용가능함
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); //상속함
        gasCar.fillUp();

    }
}
