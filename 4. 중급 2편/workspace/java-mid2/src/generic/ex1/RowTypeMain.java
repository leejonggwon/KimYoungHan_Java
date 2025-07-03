package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {

        //다이아몬드 빼고 생성
        GenericBox integerBox = new GenericBox(); //다이아몬드를 지정 안하는것을 '로 타입', '원시 타입'이라한다
        //GenericBox<Object> integerBox = new GenericBox<>(); //같음 //권장

        integerBox.set(10); //다이아몬드 빼고 생성하면 Object 로 된다
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);

    }
}
