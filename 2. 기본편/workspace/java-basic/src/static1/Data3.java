package static1;

public class Data3 {
    public String name;
    public static int count; //static
    //static변수, 정적변수, 클래스변수: 메서드(붕어빵틀)에서 관리하는 변수

    public Data3 (String name){
        this.name = name;
        count++; //Data3.count++와 같음
    }
}
