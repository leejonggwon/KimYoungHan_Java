package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {

        //LocalTime: 시,분,초
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);
        //Ctrl + P: 커서가 위치한 메서드의 파라미터(매개변수) 조회

        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);
        System.out.println("----------");

        //계산(블변)
        //30초 더함
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("지정 시간 +30s = " + ofTimePlus);

        LocalTime nowTimePlus = nowTime.plusSeconds(30);
        System.out.println("현재 시간 +30s = " + nowTimePlus);

    }
}
