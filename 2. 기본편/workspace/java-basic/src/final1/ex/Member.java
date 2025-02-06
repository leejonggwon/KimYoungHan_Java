package final1.ex;

public class Member {

    private final String id; //final 키워드 사용
    private String name;

    //생성자
    public Member(String id,String name) {
        this.id = id; //처음 생성 할 때 값이 바뀜
        this.name = name;
    }

    public void changeData(String name){
        //this.id = id; //final이므로 id값 못바꿈, 컴파일 오류 발생
        this.name = name;
    }

    public void print(){
        System.out.println("id: " + id + ", name: " + name);
    }
}
