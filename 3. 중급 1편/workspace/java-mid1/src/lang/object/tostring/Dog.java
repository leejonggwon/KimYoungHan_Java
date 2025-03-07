package lang.object.tostring;

public class Dog extends Object {

    private String dogName;
    private int age;

    //Alt + insert → construct :생성자
    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    //Alt + insert → toString() :toString을 오버라이딩
    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
