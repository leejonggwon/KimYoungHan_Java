package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";

        //인스턴스를 생성 통한 접근
        //DecoUtil1 utils = new DecoUtil1();
        //String deco = utils.deco(s);

        //정적메서드: 객체생성없이 메서드명으로 호출함

        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
