package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA=" + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    //메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다
    static void changeReference(Data dataX){
        System.out.println("dataA=" + dataX);
        dataX.value = 20;
    }
}
