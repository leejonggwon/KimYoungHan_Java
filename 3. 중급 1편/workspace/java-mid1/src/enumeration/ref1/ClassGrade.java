package enumeration.ref1;
//회원등급을 다루는 클래스
public class ClassGrade {

    //타입 안전 열거형 패턴

    //상수를 정의할떄 등급에 따른 할인율(discountPercent)이 정해진다
    public static final ClassGrade BASIC = new ClassGrade(10); //x001
    public static final ClassGrade GOLD = new ClassGrade(20); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); //x003

    //final로 정의
    private final int discountPercent;

    //private 생성자, discountPercent를 관리
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //Getter 조회기능
    public int getDiscountPercent() {
        return discountPercent;
    }
}
