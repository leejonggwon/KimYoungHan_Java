package nested.anonymous.ex;

public class Ex0RefMain {

    public static void hello(String str){
        System.out.println("프로그램 시작"); //변하지 않는 부분
        System.out.println(str);           //str: 변하는 부분
        System.out.println("프로그램 종료"); //변하지 않는 부분
        System.out.println("----------");
    }

    public static void main(String[] args) {
        hello("hello Java");
        hello("hello Spring");
    }
    //핵심
    //변하는 부분과 변하지 않는 부분을 분리하라
    //변하는 부분을 메서드 외부에서 전달받는 점이다
    //그러면 재사용성 있는 기능을 높일수 있다
}
