package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        //now에 ChronoField인 SECOND_OF_MINUTE를 지원하는지 여부를 확인한다
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported); //false

        //만약 지원(true)을 하면 기능을 사용
        if (supported){
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute = " + minute);
        }



    }
}
