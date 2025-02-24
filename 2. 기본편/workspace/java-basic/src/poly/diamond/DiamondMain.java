package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child(); //부모는 자식을 담을수 있다
        a.methodA();
        //InterfaceA에 methodA()에서 오버라이딩 되어있는
        //→ Child에 methodA()로 호출함
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
