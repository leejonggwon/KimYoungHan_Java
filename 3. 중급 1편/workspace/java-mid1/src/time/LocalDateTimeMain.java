package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        //LocalDateTime: 년,월,일,시,분,초

        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);
        System.out.println("----------");

        //날짜와 시간을 분리하기
        //날짜(년월일)를 분리
        LocalDate localDate = ofDt.toLocalDate();
        //시간(시분초)을 분리
        LocalTime localTime = ofDt.toLocalTime();

        System.out.println("localDate = " + localDate); //2016-08-16
        System.out.println("localTime = " + localTime); //08:10:01
        System.out.println("----------");

        //날짜와 시간 합체하기
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime); //2016-08-16T08:10:01
        System.out.println("----------");

        //계산하기(불변)
        //1000일 더하기
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜시간 +1000d = " + ofDtPlus);

        //1년 더하기
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜시간 +1년 = " + ofDtPlus1Year);
        System.out.println("----------");

        //비교하기
        //~보다 이전(과거)인가
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? "
                + nowDt.isBefore(ofDt));
        //~보다 이후(미래)인가
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? "
                + nowDt.isAfter(ofDt));

        //isEquals: 시간적으로 동일한가?
        //equals: 데이터의 구성요소가 동일한가?
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? "
                + nowDt.isEqual(ofDt));

    }
}
