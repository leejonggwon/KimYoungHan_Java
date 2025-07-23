package collection.compare;
import java.util.Arrays;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array); //배열의 요소들을 오름차순(작은 값 → 큰 값)으로 정렬
        System.out.println(Arrays.toString(array)); //[1, 2, 3]

    }
}
