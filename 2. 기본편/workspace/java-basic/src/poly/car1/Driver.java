package poly.car1;

public class Driver {
    //자동차를 사용하는 클라이언트 코드

    //Driver는 자동차의 역할에만 의존한다
    private Car car;

    //자동차설정
    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    //운전하기
    public void drive(){
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
