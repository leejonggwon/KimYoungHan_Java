package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요(종료 0)");

        while (true){
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }
            numbers.add(input);
        }

        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }

        double average =(double) total/numbers.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}

