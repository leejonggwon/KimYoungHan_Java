package poly.car1;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("k3Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("k3Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("k3Car.pressAccelerator");
    }
}
