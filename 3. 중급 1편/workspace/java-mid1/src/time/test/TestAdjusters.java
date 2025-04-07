package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        //입력 받은 월의 첫날 요일과 마지막날 요일을 구해라
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 5);

        //getDayOfWeek()는 해당 날짜가 무슨 요일인지 알려주는 메서드
        //getDayOfMonth()는 날짜 객체(LocalDate 등)에서 "며칠인지" 알려주는 메서드
        //getDayOfYear()는 자바에서 해당 날짜가 1년 중 며칠째인지를 알려주는 메서드

        //첫날
        DayOfWeek firstDayOfWeek = date.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek = " + firstDayOfWeek);

        //마지막날
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);

    }
}
