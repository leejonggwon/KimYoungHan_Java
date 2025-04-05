package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);//now에 ChronoField인 SECOND_OF_MINUTE를 쓸 수 있는지 확인
        System.out.println("supported = " + supported); //false

        if (supported){
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute = " + minute);
            //LocalDate는 년,월,일만 있는데 분,초의 필드를 지원하지 않는다 
        }



    }
}
