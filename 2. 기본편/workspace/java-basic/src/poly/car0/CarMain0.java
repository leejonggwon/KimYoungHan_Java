package poly.car0;
public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car); //k3Car인스턴스를 가지게 된다
        driver.drive();
        System.out.println("----------");

        //Model3Car로 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); //null로 K3Car 참조 뺀다
        driver.setModel3Car(model3Car); //model3Car 참조함
        driver.drive();
    }
}
