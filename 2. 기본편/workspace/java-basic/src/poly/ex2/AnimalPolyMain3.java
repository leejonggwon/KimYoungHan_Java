package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        //Ctrl + Alt + N: Inline Variable
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //Ctrl + Alt + N: 메서드 추출
    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동뭏 소리 테스트 종료");
    }
}
