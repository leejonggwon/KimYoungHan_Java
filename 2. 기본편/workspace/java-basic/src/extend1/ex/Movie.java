package extend1.ex;

public class Movie extends Item{
    private String director;
    private String actor;

    //생성자
    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    public void print(){
        super.print();
        System.out.println("- 감독:" + director + ", 배우:" + actor);
    }
}
