package nested.test.ex1;

public class Library {

    private Book[] books;  //Book 객체배열을 사용하여 도서 목록을 관리한다
    private int bookCount; //책 저장수

    public Library(int size) {
        books = new Book[size]; //생성
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        //1.검증 로직을 다 처리하고
        if(bookCount >= books.length){
            System.out.println("도서관 저장 공간이 부족합니다");
            return;
        }
        //2.정상 로직을 처리
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println("도서제목: " + books[i].title +
                    ", 저자: " + books[i].author );
        }
    }

    //Book 클래스 외부에 노출하지 않는다
    //정적 중첩 클래스
    private static class Book{
        private String title;  //제목
        private String author; //저자

        //생성자
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
