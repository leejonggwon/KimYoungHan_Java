package lang.immutable.address;

public class MemberV1 {

    private String name;
    private Address address;

    //생성자
    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    //Getter Setter
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //toString
    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
