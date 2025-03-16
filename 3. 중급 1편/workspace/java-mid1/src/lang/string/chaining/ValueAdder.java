package lang.string.chaining;

public class ValueAdder {

    private int value;

    //값을 누적해서 더하는 기능
    public ValueAdder add(int addValue){
        value += addValue;
        return this; //자신의 참조값을 반환함
    }

    public int getValue() {
        return value;
    }
}
