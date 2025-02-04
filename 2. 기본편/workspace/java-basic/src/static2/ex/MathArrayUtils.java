package static2.ex;

public class MathArrayUtils {

    //MathArrayUtils의 인스턴스를 생성하지 못하게 막는다
    // → 생성자를 private으로 막아버린다.
    private MathArrayUtils(){
    }

    public static int sum(int[] values){
        int total = 0;
        for(int value : values){
            total += value;
        }
        return total;
    }

    public static double average(int[] values){
        return (double)sum(values) / values.length;
    }

    public static int min(int[] values){
        int minValue = values[0];
        for(int value : values){
            if(value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values){
        int maxValue = values[0];
        for(int value : values){
            if(value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
