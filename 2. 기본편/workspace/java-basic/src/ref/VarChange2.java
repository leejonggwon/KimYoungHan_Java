package ref;

public class VarChange2 {
    public static void main(String[] args) {
       Data dataA = new Data();
       dataA.value = 10;
       Data dataB = dataA; //인스턴스가 복사가 되어서 만들어진것이 아니다 참조값만 읽어서 B에 들어간다

        //같은 참조값
        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

    }
}
