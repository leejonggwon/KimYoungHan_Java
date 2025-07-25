package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitPrinter {

    //제내릭 메서드
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out(); //유닛을 꺼낸다
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    //와일드카드
    public static void printV2(Shuttle<? extends BioUnit> t1){
        BioUnit unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
