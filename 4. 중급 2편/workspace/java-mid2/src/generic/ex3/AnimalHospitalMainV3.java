package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {

        //제네릭
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>(); //개병원
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>(); //고양이병원
        //AnimalHospitalV3<Integer> integer = new AnimalHospitalV3<>(); //관계없는 타입 인자를 컴파일 시점에 막는다

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();
        System.out.println("----------");

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();
        System.out.println("----------");

        // 문제1: 개 병원에 고양이 전달(타입안전성문제)
        //dogHospital.set(cat); // 다른 타입을 입력: 컴파일 오류 발생

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200)); //비교하는 대상, 더 큰개를 반환
        System.out.println("biggerDog = " + biggerDog);

    }
}
