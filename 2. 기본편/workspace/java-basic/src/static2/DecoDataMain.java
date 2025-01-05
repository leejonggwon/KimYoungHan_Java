package static2;

//import static static2.DecoData.staticCall;
//import static static2.DecoData.*; //모든 메서드 쓰고싶으면 *

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호춣1");
        DecoData data1 = new DecoData();
        data1.instanceCall();


        System.out.println("3. 인스턴스 호춣2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("4. 참조값을 매개변수로 전달하는 경우 인스턴스 변수/매서드 호출가능함");
        DecoData.staticCall(data2);

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); //인스턴스 메서드로 같아서 추천안함

        //클래스를 통한 접근
        DecoData.staticCall();

    }
}
