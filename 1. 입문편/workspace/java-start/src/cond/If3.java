package cond;

public class If3 {
    public static void main(String[] args) {

        int age = 8;

        if(age <= 7){
            System.out.println("미취학");
        }
        if(8 <= age && age <= 13){
            System.out.println("초등학생");
        }
        if(14 <= age && age <= 16 ){
            System.out.println("중학생");
        }
        if (17 <= age && age <= 19){
            System.out.println("고등학생");
        }
        if (age >= 20){
            System.out.println("성인");
        }

    }
}
