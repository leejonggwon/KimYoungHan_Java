package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        //false 둘의 참조값이 다르다
        System.out.println("equality = " + (user1.equals(user2)));
        //false

    }
}
