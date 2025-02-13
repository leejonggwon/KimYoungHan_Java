package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        System.out.println("↓ Parent 인스턴스 아님");
        parent.parentMethod();

        if(parent instanceof Child){
            //Child 인스턴스로부터 생성된 parent(객체)입니까?
            //new Child() instanceof Child
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            //Child 인스턴스 이므로 다운캐스팅

            child.childMethod();
        }
    }

}
