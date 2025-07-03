package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();
        System.out.println("----------");

        catHospital.set(cat);
        catHospital.checkup();
        System.out.println("----------");

        // 문제1: 개 병원에 고양이 전달(타입안전성문제)
        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류가 발생하지 않는다
                              // 이유는 set()에서 받아드리는게 Animal 이기 때문이다

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        //bigger() 반환타입이 Animal 이므로, Dog로 다운캐스팅을 한다.
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200)); //Animal 이므로, Dog로 강제 다운 캐스팅 한다
        System.out.println("biggerDog = " + biggerDog);

        //코드 재사용 O :다형성을 통해 AnimalHospitalV1 하나로 개와 고양이를 모두 처리한다
        //타입 안정성 X
    }
}
