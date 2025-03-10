package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id){
        this.id = id;
    }

/*
    @Override
    public boolean equals(Object obj){
        UserV2 user = (UserV2) obj; //object로 다형적 참조를 하려면 다운캐스팅이 필요하다
        return id.equals(user.id);
    }
*/

    //Alt + insert → equals() and hashCode(): equals 구현
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
}
