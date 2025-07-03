package generic.ex4;

import generic.animal.Animal;
// 제네릭 타입과 제네릭 메서드의 타입 매개변수를 같은 이름으로 사용하면 어떻게 될까?
public class ComplexBox<T extends Animal> { //제네릭 타입

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    //제네릭 메서드
    //제네릭 타입 보다 제네릭 메서드가 높은 우선순위를 가진다 (제네릭 타입은 제네릭 메서드에 관련이 없다)
    public <Z> Z printAndReturn(Z z){
        System.out.println("animal.className = " + animal.getClass().getName()); //animal 클래스명
        System.out.println("t.className = " + z.getClass().getName());
        return z;
    }
}
