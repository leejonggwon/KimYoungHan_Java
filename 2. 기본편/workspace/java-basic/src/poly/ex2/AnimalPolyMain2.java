package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        //Animal dog = new Dog()로도 가능함
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        //배열로 만들기
        Animal[] animalArr = {dog, cat, caw, duck};

        //iter: 향상된for문
        //변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동뭏 소리 테스트 종료");
            System.out.println("-----------------");
        }
    }
}
