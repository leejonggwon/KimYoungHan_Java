package extend1.ex2;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //상속함
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); //상속함
        gasCar.fillUp();

    }
}
