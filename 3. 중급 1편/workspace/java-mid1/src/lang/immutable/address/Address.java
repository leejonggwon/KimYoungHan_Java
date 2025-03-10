package lang.immutable.address;

public class Address {

    private  String value; //주소를 보관하는 객체

    //생성자
    public Address(String value) {
        this.value = value;
    }

    //Getter/Setter는 private으로 선언된 클래스의 멤버변수에 대해,
    // 외부에서 접근할 수 있도록 만들어 줄 수 있습니다.
    //Getter
    public String getValue() {
        return value;
    }

    //Setter
    public void setValue(String value) {
        this.value = value;
    }

    //toString(): 객체정보를 문자열 형태로 제공한다.
    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}

