package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data();

        //User는 다른 위치 패키지에 있음
        pack.a.User user = new pack.a.User();
    }
}
