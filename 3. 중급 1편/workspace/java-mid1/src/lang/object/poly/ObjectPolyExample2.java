package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog(); //Ctrl + Alt + V: 변수자동추출
        Car car = new Car();
        Object object = new Object(); //Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};
        
        size(objects); //메서드

    }

    //Object 타입의 배열은 모든 객체를 담을 수 있기 때문에, 사용하므로 어디서는 사용할 수 있다
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}
