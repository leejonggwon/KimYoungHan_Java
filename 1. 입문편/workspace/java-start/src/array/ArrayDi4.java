package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr= new int[3][3];

        int i = 1;
        for (int row =0; row <arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++; //대입하고 1증가 시킨다
            }
        }

        for (int row = 0; row < arr.length; row++ ){
            for(int column =0; column < arr[row].length; column++ ){
                System.out.print(arr[row][column] + " "); //0열 출력
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다
        }
    }
}
