package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    //생성자
    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    //합계출력
    public int getTotalPrice(){
        return price * quantity;
    }
}
