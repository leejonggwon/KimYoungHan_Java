package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        
        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각 : " + dateTime);

        //메서드체인으로 할수 있음
        LocalDateTime afterDt = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + afterDt);
    }
}
