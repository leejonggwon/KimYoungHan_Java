package enumeration.test.http;

import java.util.Arrays;
import java.util.Scanner;

public class HttpStatuMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();

        //ALT + Enter → Create method
        HttpStatus status = HttpStatus.findByCode(httpCodeInput);

        if(status == null){
            System.out.println("정의되지 않는 코드");
        }else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
