package enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {

        //values(): 모든 ENUM 상수를 포함하는 배열을 반환함
        //name(): Enum 상수의 이름을 문자열로 반환함
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println(" grade=" + value.name()
                    + ", level=" + value.getLevel()
                    + ", 설명=" + value.getDescription()  );
        }
    }
}
