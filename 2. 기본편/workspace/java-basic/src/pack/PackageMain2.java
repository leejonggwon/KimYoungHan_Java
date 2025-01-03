package pack;

import pack.a.*; // pack.a 패키지안 모든 클래스를 사용할 수 있음

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //import 사용으로 패키지 명 생략 가능
    }
}
