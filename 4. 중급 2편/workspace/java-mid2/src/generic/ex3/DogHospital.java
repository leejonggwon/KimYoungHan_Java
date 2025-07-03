package generic.ex3;
import generic.animal.Dog;

public class DogHospital { //개전용병원으로 개만 받을 수 있다

    private Dog animal;

    //Dog 를 받아서 저장한다
    public void set(Dog animal) {
        this.animal = animal;
    }

    //Dog는 Animal의 자식이므로 개의 이름, 크기를 출력, sound()메서드를 호출
    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    //두 개를 비교하여 큰개를 반환
    public Dog bigger(Dog target){
        return animal.getSize() > target.getSize() ? animal : target; //삼항연산자
    }

}
