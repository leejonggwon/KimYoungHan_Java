package generic.animal;

public class Dog extends Animal{

    //생성자
    public Dog(String name, int size) {
        super(name, size);
    }

    //오버라이딩: Ctrl + O
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
