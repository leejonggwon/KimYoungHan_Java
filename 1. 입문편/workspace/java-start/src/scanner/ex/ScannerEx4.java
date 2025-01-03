package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = input.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
