package generic.ex3;

import generic.animal.Animal;

//타입인자로 받을 수 있는 값이 Animal 과 그 자식으로 제한된다
public class AnimalHospitalV3<T extends Animal> { //T는 최소한 Animal 기능을 쓸 수 있게 된다

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}

