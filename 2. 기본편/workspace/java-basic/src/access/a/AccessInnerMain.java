package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        //public이므로 외부에서 호출할 수 있다
        data.innerAceess();
    }
}
