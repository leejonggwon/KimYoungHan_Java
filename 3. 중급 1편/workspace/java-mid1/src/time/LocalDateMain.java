package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {

        //LocalDate: 년,월,일
        //현재 날짜를 가져옴
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜= " + nowDate);

        //특정 날짜를 기준으로 생성한다
        LocalDate ofDate = LocalDate.of(2013,11,21); //2013-11-21
        System.out.println("지정 날짜= " + ofDate);
        System.out.println("----------");

        //계산(불변이므로 반환값 받아야함)
        //plusDays(10): 10일을 더함
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d = " + ofDate);

        nowDate = nowDate.plusDays(10);
        System.out.println("오늘 날짜 + 10d = " + nowDate);

    }
}
