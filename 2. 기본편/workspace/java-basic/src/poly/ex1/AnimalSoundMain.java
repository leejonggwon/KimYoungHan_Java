package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog(); //Ctrl+Alt+V :변수만들기
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 테스트 종료");

        soundCat(cat);
        soundCaw(caw);
    }
    private static void soundCat(Cat cat){
        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 테스트 종료");
    }

    private static void soundCaw(Caw caw){
        System.out.println("동물소리 테스트 시작");
        caw.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
