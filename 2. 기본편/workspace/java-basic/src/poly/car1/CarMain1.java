package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car); //Car는 부모이므로 k3Car 받는다
        driver.drive();
        System.out.println("-----------");

        //차량 변경(k3 → model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
        System.out.println("-----------");

        //OCP원칙: 기존코드 수정없이 새로운 기능을 추가할 수 있다
        //차량 변경(model3 → newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
        System.out.println("-----------");
    }
}
