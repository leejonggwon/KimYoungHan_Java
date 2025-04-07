package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        //Period: 년,월,일, 날짜
        //생성하기
        Period period = Period.ofDays(10); //10일
        Period period1 = Period.ofWeeks(2);
        Period period2 = Period.ofMonths(6);
        Period period3 = Period.ofYears(3);

        System.out.println("period = " + period); //P10D //10일
        System.out.println("period1 = " + period1);
        System.out.println("period2 = " + period2);
        System.out.println("period3 = " + period3);
        System.out.println("----------");

        //계산에 사용할 수 있음
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period); //특정시점에 시간의양을 더할수 있음
        System.out.println("currentDate = " + currentDate);
        System.out.println("plusDate = " + plusDate); //2030-01-11


        //기간 차이 구하기
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);

        System.out.println("between = " + between); //P3M1D
        System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일"); //3개월1일

    }
}
