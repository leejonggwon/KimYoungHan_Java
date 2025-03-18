package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        //Class helloClass = Hello.class; //클래스에서 조회
        Class helloClass = Class.forName("lang.clazz.Hello"); //문자열로 조회
        //Class helloClass = new Hello().getClass(); //인스턴스에서 조회


        //helloClass.생성자를 선택.선택된 생성자를 기반으로 인스턴스를 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}
