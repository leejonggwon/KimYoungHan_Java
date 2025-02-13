package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        //Animal dog = new Dog() 로 해도 상관없음
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog); //부모는 자식을 담을수 있음
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }
    //부모는 자식을 담을수 있으므로 dog, cat, caw 가능함
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        //매서드 오버라이딩으로 각자의 sound 출력함
        System.out.println("동물 소리 테스트 종료");
    }
}
