package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extindex = str.indexOf(ext); //5
        String filename = str.substring(0, extindex); //0부터 5미만
        String extName = str.substring(extindex);     //5이상

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);





    }
}
