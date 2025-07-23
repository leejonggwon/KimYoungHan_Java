package collection.compare;
import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {3,2,1};
        System.out.println(Arrays.toString(array)); //[3, 2, 1]
        System.out.println();

        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator()); //비교자를 직접 넣을 수 있다
        System.out.println("AscComparator: " + Arrays.toString(array)); //[1, 2, 3]
        System.out.println();

        Arrays.sort(array, new DescComparator());
        System.out.println("DesComparator: " + Arrays.toString(array)); //[3, 2, 1]
        System.out.println();

        Arrays.sort(array, new AscComparator().reversed()); //DescComparator 와 같다
        System.out.println("AscComparator.reversed" + Arrays.toString(array)); //[3, 2, 1]
    }


    //비교자 //오름차순
    static class AscComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            int result = (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
            System.out.println("o1=" + o1 + ", o2=" + o2 + ", 반환값=" + result);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1); //값을 비교해서 정렬을 한다
        }
    }

    //내림차순
    static class DescComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            int result = (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
            System.out.println("o1=" + o1 + ", o2=" + o2 + ", 반환값=" + result);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1; //-1로 결과가 반대값을 반환한다
        }
    }

}
