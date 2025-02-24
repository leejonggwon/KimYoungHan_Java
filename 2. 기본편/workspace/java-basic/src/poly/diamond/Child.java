package poly.diamond;

//인터페이스는 다중구현을 허용함(부모가 2개임)
public class Child implements InterfaceA, InterfaceB{
//Alt + enter → method implement
    @Override
    public void methodA() {
        System.out.println("Child.MethodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.MethodB");
    }

    //둘다 있으므로 하나만 오버라이딩 하면됨
    @Override
    public void methodCommon() {
        System.out.println("Child.MethodCommon");
    }
}
