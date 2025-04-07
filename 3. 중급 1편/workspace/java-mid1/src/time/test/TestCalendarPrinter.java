package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.println("월을 입력하세요: ");
        int month =scanner.nextInt();

        printCalender(year, month);

    }


    private static void printCalender(int year, int month) {
        //입력 첫날
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        System.out.println("firstDayOfMonth = " + firstDayOfMonth); //2025-01-01

        //입력 다음달 첫날
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
        System.out.println("firstDay = " + firstDayOfNextMonth); //2025-02-01


        //getDayOfWeek(): 요일정보 가져온다
        //getValue(): 요일을 정수로 반환, MONDAY = 1
        //% 7: 월요일=1(1%7=1) ... 일요일=0(7%7=0)
        //3 = 2025-01-01.WEDNESDAY.3 % 7
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        System.out.println("offsetWeekDays = " + offsetWeekDays); //3

        System.out.println("Su Mo Tu We Th Fr Sa ");

        //달력앞 빈칸
        //2025년 1월의 경우 3칸이 띄어진다
        for(int i = 0; i < offsetWeekDays; i++){
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        //System.out.println("dayIterator = " + dayIterator); //2025-01-01

        //dayIterator가 firstDayOfNextMonth보다 이전일때 까지
        while(dayIterator.isBefore(firstDayOfNextMonth)){

            //System.out.print(dayIterator.getDayOfMonth() + " "); //해당 달의 일을 출력
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); //일자반환
            //%: 포멧시작, 2: 너비2, d: 정수출력, " ":한칸띄우기

            //토요일이면 줄바꿈
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1); //하루증가한다
        }

    }
}
