package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        //Instant: 초, 1970년 UTC 기준

        //생성하기
        Instant now = Instant.now(); //UTC 기준으로 생성
        System.out.println("now = " + now);
        //UTC 기준이므로 -9시간이 출력됨

        ZonedDateTime zdt = ZonedDateTime.now();

        //Instant.from(): Instant로 객체를 변환
        //ZonedDateTime에는 ZoneId가 있어서 Instant로 변환이 가능하다
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        //1970년 1월 1일 0시 0분 부터 60초를 더한값
        Instant epochStart = Instant.ofEpochSecond(60);
        System.out.println("epochStart = " + epochStart); //1970-01-01T00:01:00Z

        //계산
        Instant later = epochStart.plusSeconds(90);
        System.out.println("later = " + later); //1970-01-01T00:02:30Z

        //조회하는 기능: 에포트로 부터 흐른시간 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);

    }
}
