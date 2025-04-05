package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10); //10일
        System.out.println("period = " + period); //P10D //10일


        //계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period); //특정시점에 시간의양을 더함
        System.out.println("currentDate = " + currentDate);
        System.out.println("plusDate = " + plusDate);


        //기간 차이 구하기
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);

        System.out.println("between = " + between); //P3M1D //3개월1일
        System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일");

    }
}
