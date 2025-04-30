package nested.inner.ex1;

// Car에서만 사용
public class Engine {

    private Car car;
    //Engine은 Car를 내부에 저장하고, 시동 걸 때 Car의 정보 (getModel, getChargeLevel)를 이용함
    //엔진은 자기를 장착한 자동차의 정보를 확인할 수 있음

    //생성자
    //어떤 자동차 소속된 엔진인지
    public Engine(Car car) {
        this.car = car;
    }

    //엔진시동
    public void start(){
        System.out.println("충전 레벨 확인: " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");

    }
}
