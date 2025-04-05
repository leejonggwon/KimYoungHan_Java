package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {

        //ChronoUnit는 시간 단위임, ENUM 타입임
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("----------");


        System.out.println("HOURS = " + ChronoUnit.HOURS);
        //ChronoUnit.HOURS: 시간(hour) 단위를 의미
        //Hours
        System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration());
        //.getDuration(): Duration 객체로 반환
        //PT1H
        System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
        //3600
        //.getSeconds(): Duration 객체에서 초 단위의 값을 가져옴
        System.out.println("----------");


        System.out.println("DAYS = " + ChronoUnit.DAYS);
        //Days
        System.out.println("DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());
        //86400
        System.out.println("----------");


        //차이 구하기(초)
        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("secondsBetween = " + secondsBetween); //600

        long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("minutesBetween = " + minutesBetween); //10

    }
}
