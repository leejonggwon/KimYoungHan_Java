package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //StringBuilder는 Method Chaining을 사용가능함
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4,"Java")
                .delete(4, 8)
                .reverse()
                .toString();
/*
        sb.append("A"); //문자열 추가
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4,"Java"); //4번째에 "JAVA"를 삽입
        System.out.println("insert = " + sb);

        sb.delete(4, 8); //4부터 8까지 삭제
        System.out.println("delete = " + sb);

        sb.reverse(); //문자열을 뒤집음
        //바로 적용된다
        System.out.println("reverse = " + sb);

        //StringBulder(가변) → String(불변)
        String string = sb.toString();
*/
        System.out.println("string = " + string);

    }
}
