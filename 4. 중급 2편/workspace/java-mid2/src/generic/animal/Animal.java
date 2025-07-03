package generic.animal;

public class Animal {

    private String name;
    private int size;

    //생성자
    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    //메서드
    public void sound(){
        System.out.println("동물 울음 소리");
    }

    @Override
    public String toString() { //toString()은 객체의 내용을 문자열로 보여주는 메서드
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
