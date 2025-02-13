package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스는 생성이 불가함(컴파일오류)
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        cat.sound();
        cat.move();
        System.out.println("-----------");

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);

    }
    //변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동뭏 소리 테스트 종료");
        System.out.println("-----------");
    }
}
