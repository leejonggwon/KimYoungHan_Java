package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
//제네릭 타입을 사용
public class Shuttle <T extends BioUnit> {

    private T unit;

    //set 역할
    public void in(T t) {
        unit = t;
    }

    //get 역할
    public T out(){
        return unit;
    }

    //탑승한 유닛의 정보를 출력
    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

}
