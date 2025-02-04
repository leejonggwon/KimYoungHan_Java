package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();

        //User import를 했기 때문에 이름 겹쳐지지 않된다, 둘 중 하나를 적어야한다.
        pack.b.User userB = new pack.b.User();
    }
}
