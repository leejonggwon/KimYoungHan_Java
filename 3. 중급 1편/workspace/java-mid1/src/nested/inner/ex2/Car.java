package nested.inner.ex2;

//바깥클래스
public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    //생성자
    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
        // 생성된 Engine 인스턴스는 자신을 생성한 바깥의 Car 인스턴스를 자동으로 참조한다
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }


    //Engine 내부클래스
    //내부클래스는 바깥클래스의 인스턴스를 접근 할 수 있다
    private class Engine {

        //엔진스타트
        public void start(){
            System.out.println("충전 레벨 확인: " + chargeLevel);
            //내부클래스 이므로 바깥에서 접근 할 수 있다
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }


}
