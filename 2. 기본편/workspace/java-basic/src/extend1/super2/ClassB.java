package extend1.super2;

public class ClassB extends ClassA {

    public ClassB(int a, int b){
        super(); //매개변수 없는 기본 생성자,
                 //super() 자동으로 만들어줌, 생략 가능함
                 //호출순서는 부모클래스 먼저 호출함
                 //하나는 마지막에 super()호출홤
        System.out.println("ClassB 생성자 a=" +a + " b=" +b);
    }

    public ClassB(int a){
        this(a,0);
        System.out.println("ClassB 생성자 a= " + a);
    }
}