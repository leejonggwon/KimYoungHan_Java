package extend1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        //this(): 나아닌 다른생성자 호출함
        this(a, 200); //첫줄 부모클래스 생성자 호출해야함 //기본 생성자의 경우 super 생략 가능함
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB(int a, int b){
        super(); //기본 생성자 생력 가능함
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }


}