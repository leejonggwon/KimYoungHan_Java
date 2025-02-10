package extend1.ex;

//public final class Item :class에 final이 붙으면 상속이 불가능 하다
public class Item {
    private String name;
    private int price;

    //생성자
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    //public final void print(): 메서드에 final 붙으면 오버라이딩 불가함
    public void print(){
        System.out.println("이름:" + name + ", 가격:" + price);
    }
}
