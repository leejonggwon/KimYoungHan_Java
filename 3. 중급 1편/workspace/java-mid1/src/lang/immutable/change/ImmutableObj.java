package lang.immutable.change;

public class ImmutableObj {

    private final int value; //불변

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
    //    int result = value + addValue;
    //    ImmutableObj immutableObj = new ImmutableObj(result);
    //    return immutableObj;
        // Ctrl + Alt + N : inline variable
        return new ImmutableObj(value + addValue);
    }

    //Getter
    public int getValue() {
        return value;
    }
}
