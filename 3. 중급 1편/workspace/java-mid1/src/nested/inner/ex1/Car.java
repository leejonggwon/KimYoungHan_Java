package nested.inner.ex1;

public class Car {

    private String model;      //모델정보
    private int chargeLevel;   //충전레벨
    private Engine engine;     //Car가 만들어 질때, 자신의 정보를 담고 있는 Engine을 생성함

    //생성자
    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this); //Engine을 만들때, 자동차(현재 객체 자신)에 대한 정보를 넘겨야한다
    }

    //Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    //Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }

}
