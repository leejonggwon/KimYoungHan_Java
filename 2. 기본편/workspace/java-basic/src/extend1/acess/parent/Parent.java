package extend1.acess.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privatedValue;


    public void publicMethod(){
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod(){
        System.out.println("Parent.protectedMethod");
    }

    void defautltMethod(){
        System.out.println("Parent.defautltMethod");
    }

    private void privateMethod(){
        System.out.println("Parent.privateMethod");
    }

    //자기 자신을 호출함
    public void printParent(){
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privatedValue = " + privatedValue);

        //부모 메서드 안에서 모두 접근 가능함
        defautltMethod();
        privateMethod();
    }
}
