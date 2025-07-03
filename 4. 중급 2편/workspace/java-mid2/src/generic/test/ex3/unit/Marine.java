package generic.test.ex3.unit;

public class Marine extends BioUnit{

    //Marine 클래스의 생성자가 부모 클래스의 생성자를 호출
    public Marine(String name, int hp) {
        super(name, hp); //부모 클래스(Unit)의 생성자를 호출해서 name, hp 초기화
    }
}
