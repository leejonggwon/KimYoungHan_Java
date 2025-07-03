package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);
        System.out.println("-----------");

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        System.out.println("-----------");

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        System.out.println("dog = " + dog);

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox); //dogBox를 입력하면 Animal로 반환된다
        System.out.println("animal = " + animal);
    }
}
