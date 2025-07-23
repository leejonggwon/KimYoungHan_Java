package collection.compare;

public class MyUser implements Comparable<MyUser> { //이 클래스(MyUser) 객체들을 정렬할 "기본 기준"을 정해주는 역할

    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    //오름차순 //나이를 기준으로 비교한다 //기본정렬순서로 설정
    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : ((this.age == o.age) ? 0 : 1);
    }


    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
