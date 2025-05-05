package genegic.ex1;

public class ObjectBox {
    //Object는 모든 타입의 부모이다. 다형적 참조를 사용해서 문제를 해결할 수 있다

    private Object value;

    public void set(Object object){
        this.value = object;
    }

    public Object get(){
        return value;
    }
}
