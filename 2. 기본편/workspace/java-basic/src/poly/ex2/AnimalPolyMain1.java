package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Animal dog = new Dog(); //Animal은 부모
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);

    }
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //매서드 오버라이딩으로 각자를 출력함
        System.out.println("동물 소리 테스트 종료");
    }
}
