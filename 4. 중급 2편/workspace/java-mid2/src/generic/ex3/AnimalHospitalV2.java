package generic.ex3;

//제네릭을 도입해서 코드 재사용성을 늘리고, 타입 안정성 문제도 해결해 보자
public class AnimalHospitalV2<T> {

    //개, 고양이 모두 들어올수 있는 병원
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        // T의 어느 타입이 들어올지 T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용할 수 있다
        animal.toString();
        animal.equals(null);

        // 컴파일 오류가 발생
        //System.out.println("동물 이름: " + animal.getName());
        //System.out.println("동물 크기: " + animal.getSize());
        //animal.sound();
    }

    public T bigger(T target){
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}

