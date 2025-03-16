package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "      Hello Java     ";

        String trimmed = original.trim();
        String striped = original.strip(); //trim과 같은기능
        System.out.println(trimmed);
    }
}
