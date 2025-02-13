package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        //Dog dog = new Dog();
        //Cat cat = new Cat();
        //Caw caw = new Caw();
        //Duck duck = new Duck();

        //Ctrl + Alt + N: Inline Variable로 변경하기
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};

        for (Animal animal : animalArr) {
            //System.out.println("동물 소리 테스트 시작");
            //animal.sound();
            //System.out.println("동뭏 소리 테스트 종료");
            //Ctrl + Alt + M: 해당내용 메서드로 추출함
            soundAnimal(animal);
        }
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동뭏 소리 테스트 종료");
    }
}
