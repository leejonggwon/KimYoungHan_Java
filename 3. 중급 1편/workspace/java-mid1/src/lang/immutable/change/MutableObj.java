package lang.immutable.change;

public class MutableObj {

    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int addVaule) {
        value = value + addVaule;
    }

    //Getter Setter
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
