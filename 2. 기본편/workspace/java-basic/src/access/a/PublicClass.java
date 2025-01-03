package access.a;

public class PublicClass {
    public static void main(String[] args) {
        //자기 자신을 생성함
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1{
}

class DefaultClass2{
}
