package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        //정적메서드: 객체생성없이 메서드명으로 호출함
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
