package lang.wapper;

public class MyInteger {

    private final int value; //불변

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //나의값(value)과 넘어온값(target)의 비교
    public int compareTo(int target){
        if (value < target){
            return -1;
        }else if (value > target){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
        //숫자를 문자로 반환
    }
}
