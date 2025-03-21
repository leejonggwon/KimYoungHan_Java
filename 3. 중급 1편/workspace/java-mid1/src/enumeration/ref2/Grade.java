package enumeration.ref2;

public enum Grade {
    //Grade도 클래스이다, 생성자, Getter도 만들수 있다

    //괄호열고 생성자를 호출하면 된다
    BASIC(10), GOLD(20), DIAMOND(30);

    //필드추가
    private final int discountPercent;

    //생성자
    //enum에서 접근제한자가 생략되어 있음
    // private라고 생각하면 됨
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //Getter
    public int getDiscountPercent() {
        return discountPercent;
    }
}
