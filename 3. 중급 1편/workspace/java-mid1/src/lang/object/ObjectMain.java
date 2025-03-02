package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child(); //Ctrl + Alt + V: 변수자동추출
        child.childMethod();
        child.parentMathod();

        //toString()은 Object 클래스의 메서드
        String string = child.toString(); //toString()" 객체의 정보를 제공한다
        System.out.println(string);
    }
}
