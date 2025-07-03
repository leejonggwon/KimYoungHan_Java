package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital(); //개병원
        CatHospital catHospital = new CatHospital(); //고양이병원

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);



        // 개 병원
        dogHospital.set(dog); //Dog 를 받아서 저장한다
        dogHospital.checkup();
        System.out.println("----------");

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();
        System.out.println("----------");

        // 문제1: 개 병원에 고양이 전달하면
        //dogHospital.set(cat); // 다른 타입을 입력하면 컴파일 오류 발생

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200)); //비교하는 대상, 더 큰 개를 반환
        System.out.println("biggerDog = " + biggerDog);
        System.out.println("----------");

        //코드 재사용X: 개 병원과 고양이 변원은 중복이 많이 보인다
        //타입 안정성O: 타입 안전성이 명확하게 지켜진다

    }
}
