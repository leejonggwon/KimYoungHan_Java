package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        //년도만 2020년으로 바꿔서 새로운 인스턴스를 만들어서 반환
        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("changedDt1 = " + changedDt1);

        //편의메서드
        LocalDateTime changedDt2 = dt.withYear(2020);
        System.out.println("changedDt2 = " + changedDt2);

        //TemproralAdjusters 사용(복잡하게 날짜를 수정)
        //다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜: " + dt);
        System.out.println("다음 금요일: " + with1); //기준날짜에 대한 다음주 금요일

        //이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일: " + with2);


    }
}
