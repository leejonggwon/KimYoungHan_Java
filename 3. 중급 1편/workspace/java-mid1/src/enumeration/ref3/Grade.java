package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20),
    DIAMOND(30), VIP(40);

    //필드추가
    private final int discountPercent;

    //생성자
    //enum에서 접근제한자가 막혀있음 private라고 생각하면 된다
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    //내부에 discount() 메서드를 만들어 스스로 계산한다
    //가지고 있는 discountPercent와 계산을 한다
    public int discount(int price){
        return price * discountPercent / 100 ;
    }

}
