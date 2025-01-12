package static2;

public class DecoData {

    private int instanceValue;      //인스턴스변수
    private static int staticValue; //정적변수

    //정적메서드
    public static void staticCall(){
        //instanceValue++; //인스턴스 변수 접근불가, compile error
        //instanceMethod(); //인스턴스 메서드 접근불가, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    //인스턴스메서드
    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    //참조값을 직접 매개변수로 전달하면 정적 메서드도 인스턴스의 변수나 메서드를 호출할 수 있음
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }


    private void instanceMethod(){
        System.out.println("instanceValue= " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticMethod= " + staticValue);
    }
}
