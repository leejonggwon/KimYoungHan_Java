package lang.immutable.address;

public class ImmutableAddress {

    private final String value; //불변객체

    //생성자를 통해서만 값을 설정할 수 있고, 이후에는 값을 변경하는 것이 불가능하다
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}

