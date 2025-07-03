package generic.ex3;

import generic.animal.Animal;
//Dog, Cat은 Animal 이라는 명확한 부모 타입이 있다.
// 다형성을 사용하여 중복을 제거해보자

public class AnimalHospitalV1 {

    //개, 고양이 모두 들어올수 있는 병원
    private Animal animal;

    public void set(Animal animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}

