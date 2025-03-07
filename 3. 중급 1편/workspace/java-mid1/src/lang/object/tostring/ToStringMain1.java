package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toSting() 반환값 출력
        System.out.println(string); //java.lang.Object@7b23ec81

        //object 직접출력
        System.out.println(object); // object == object.toString()


    }
}
