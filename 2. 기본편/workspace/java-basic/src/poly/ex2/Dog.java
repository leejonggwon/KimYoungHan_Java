package poly.ex2;

public class Dog extends Animal{ //상속

    //Ctrl+O :오버라이딩
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
