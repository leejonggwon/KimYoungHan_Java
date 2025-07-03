package generic.ex1;

public class ObjectBox {

    private Object value; //Object는 모든 타입의 부모이다. 다형적 참조를 사용해서 문제를 해결

    public void set(Object object){
        this.value = object;
    }

    public Object get(){
        return value;
    }
}
