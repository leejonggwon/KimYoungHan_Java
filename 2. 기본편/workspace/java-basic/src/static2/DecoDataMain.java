package static2;


//import static static2.DecoData.*; //모든 메서드 쓰고싶으면 *
import static static2.DecoData.staticCall;;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); //Alt + enter → Add on-demand static import for.. : 정적메서드 여러번 호출 클래스명 간단하게함
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();


        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("4. 참조값을 매개변수로 전달하는 경우 인스턴스 변수/매서드 호출가능함");
        DecoData.staticCall(data1);

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); //인스턴스 메서드로 호출하는것 같아서 추천안함

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
