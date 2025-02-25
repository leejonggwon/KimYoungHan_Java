package extend1.ex;

public class Book extends Item {
    private String author;
    private String isbn;

    //생성자
    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    //Ctrl + O → 메서드선택 :메서드 오버라이딩
    @Override
    public void print(){
        super.print();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }

}
