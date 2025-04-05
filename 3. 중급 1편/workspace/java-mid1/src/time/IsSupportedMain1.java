package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
        ////LocalDate는 년,월,일만 있는데 초를 꺼내면 예외가 터진다


    }
}
