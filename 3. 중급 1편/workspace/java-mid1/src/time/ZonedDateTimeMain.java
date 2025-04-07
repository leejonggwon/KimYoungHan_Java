package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {

        //ZonedDateTime: LocalDateTime + ZoneOffset + ZoneId
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt); //2025-03-30T00:53:35.975270800+09:00[Asia/Seoul]
        System.out.println("----------");

        LocalDateTime ldt = LocalDateTime.of(2030,1,1,13,30,50);
        System.out.println("ldt = " + ldt);

        //ZonedDateTime 안에 LocalDateTime을 넣을 수 있다
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1); //2030-01-01T13:30:50+09:00[Asia/Seoul]

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);
        System.out.println("----------");

        //UTC로 변경하기
        //withZoneSameInstant(ZoneId): 타임존 변경하기
        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt = " + utcZdt);
    }
}
