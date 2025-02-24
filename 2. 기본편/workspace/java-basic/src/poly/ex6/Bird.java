package poly.ex6;

//상속(한개이므로 먼저함)과 구현(여러개 할수 있음)
public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
