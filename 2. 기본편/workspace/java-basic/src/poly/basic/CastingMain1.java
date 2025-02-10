package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 → 자식 타입)
        Child child = (Child) poly;
        //poly를 강제로 Child로 바꿔서 대입함
        //Child child = (Child) x001; //x001을 Child타입으로 변경후 대입함

        child.childMethod();
        child.parentMethod();
    }
}
