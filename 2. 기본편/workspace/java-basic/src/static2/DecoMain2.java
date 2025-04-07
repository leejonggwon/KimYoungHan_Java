package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";

        //static메서드는 인스턴스생성 없이 호출이 가능함
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
