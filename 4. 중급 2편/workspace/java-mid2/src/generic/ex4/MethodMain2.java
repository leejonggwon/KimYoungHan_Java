package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 100);

        AnimalMethod.<Dog>checkup(dog); //추론으로 Dog 알 수 있으므로 <Dog> 생략해도 된다
        AnimalMethod.<Cat>checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.<Dog>bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);

    }
}
