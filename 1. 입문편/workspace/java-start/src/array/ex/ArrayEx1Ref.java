package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {

        int[]students= new int[]{90, 80, 70, 60, 50};

        int total = 0;

        //alt + enter : 추천된 코드로 진행
        for (int student : students) {
            total += student;
        }

        double average = (double)total / students.length;

        System.out.println("점수 총합: "+ total);
        System.out.println("점수 평균 "+ average);
    }
}
