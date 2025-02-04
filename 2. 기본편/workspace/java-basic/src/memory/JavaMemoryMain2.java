package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(); //Alt + Enter → Create method : 메서드 만듬
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); //참조생성
        method2(data1); //참조2생성
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value= " +  data2.getValue());
        System.out.println("method2 end"); //참조2없어짐
    }

}
