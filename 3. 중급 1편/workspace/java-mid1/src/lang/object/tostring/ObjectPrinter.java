package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object object){
        String string = "객체 정보 출력: " + object.toString();
        System.out.println(string);
    }
}
