package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; //this가 생략되어 있는 경우
    }

}
