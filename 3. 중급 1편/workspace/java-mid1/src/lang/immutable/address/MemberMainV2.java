package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

       //회원A 와 회원B는 같은 Adress를 참조하고 있다
       MemberV2 memberA = new MemberV2("회원A", address);
       MemberV2 memberB = new MemberV2("회원B", address);

       //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B의 주소를 부산으로 변경해야함
        //memberB.getAddress().setValue("부산"); //컴파일 오류

        memberB.setAddress(new ImmutableAddress("부산"));
        //새로운 주소객체를 만들어서 전달함
        System.out.println("부산 → memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
