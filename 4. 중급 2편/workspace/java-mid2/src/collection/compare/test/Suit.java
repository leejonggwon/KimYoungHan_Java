package collection.compare.test;

public enum Suit { //정해진 상수는 ENUM을 사용한다

    SPADE("♠"),   //스페이드(♠)
    HEART("♥"),   //하트(♥)
    DIAMOND("◆"), //다이아몬드(◆)
    CLUB("♣");   //클로바(♣)

    private String icon;

    //생성자
    Suit(String icon) {
        this.icon = icon;
    }

    //getter
    public String getIcon() {
        return icon;
    }
}
