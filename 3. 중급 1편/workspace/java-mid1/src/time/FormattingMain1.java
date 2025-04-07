package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        //포멧팅: 날짜를 문자로 변경
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);

        //이런모양으로 문자를 만듬
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); //원하는 포멧지정
        String formattedDate = date.format(formatter);
        System.out.println("날짜와 시간 포멧팅 = " + formattedDate); //2024년 12월 31일

        //파싱: 문자를 날짜로 변경
        String input = "2030년 01월 01일"; //formatter와 모양이 같아야함
        LocalDate parsedDate = LocalDate.parse(input, formatter); //2030-01-01
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDate);

    }
}
