package time;

import java.time.temporal.ChronoField;

public class ChronoFiledMain {

    public static void main(String[] args) {

        //ChronoFiled: 날짜와 시간의 특정 부분
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range());
        }
        System.out.println("----------");


        //1월~12월을 나타내는 필드
        System.out.println("ChronoField.MONTH_OF_YEAR = "
                + ChronoField.MONTH_OF_YEAR); //MonthOfYear

        System.out.println("ChronoField.MONTH_OF_YEAR.range() = "
                + ChronoField.MONTH_OF_YEAR.range()); //1 - 12

        System.out.println("ChronoField.DAY_OF_MONTH.range() = "
                + ChronoField.DAY_OF_MONTH.range()); //1 - 28/31

    }
}
