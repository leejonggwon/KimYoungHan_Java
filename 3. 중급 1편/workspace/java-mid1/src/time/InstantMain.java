package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {

        //생성
        Instant now = Instant.now(); //UTC 기준으로 생성(영국)
        System.out.println("now = " + now);
        //UTC 기준이므로 9시간 뺀 시간이 출력됨

        ZonedDateTime zdt = ZonedDateTime.now();

        //Instant.from(): Instant로 객체를 변환
        //ZonedDateTime에는 시간대정보가 있어서 변환이 가능함
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        //1970년 1월 1일 0시 0분 부터 60초를 더한값
        Instant epochStart = Instant.ofEpochSecond(60);
        System.out.println("epochStart = " + epochStart);

        //계산
        Instant later = epochStart.plusSeconds(60);
        System.out.println("later = " + later);

        //조회: 흐른시간 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);

    }
}
