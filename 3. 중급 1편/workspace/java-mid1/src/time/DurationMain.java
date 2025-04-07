package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

    public static void main(String[] args) {
        //Duration: 시분초

        //생성하기
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration); //PT30M //30분

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt); //01:00
        System.out.println("----------");

        //계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한시간: " + plusTime);
        System.out.println("----------");

        //시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);

        Duration between = Duration.between(start, end);
        System.out.println("차이: " + between.getSeconds() + "초");
        System.out.println("근무 시간: " + between.toHours() + "시간 " + between.toMinutesPart() + "분");
        //toMinutes(): 전체 분
        //toMinutesPart(): 시간빼고 남은 분을 표현

    }
}
