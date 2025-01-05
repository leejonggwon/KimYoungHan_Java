package static2.ex;

public class Car {

    private static int totalCars;
    private String name;

    public Car(String car) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = car;
        totalCars++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
