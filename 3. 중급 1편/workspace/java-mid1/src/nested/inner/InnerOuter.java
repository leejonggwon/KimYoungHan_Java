package nested.inner;
//내부클래스
public class InnerOuter {

    private static int outClassValue = 3; //static 변수
    private int outInstanceValue = 2;     //인스턴스 변수

    //내부클래스(인스턴스 멤버가 된다)
    class Inner{
        private int innnerInstanceValue = 1;

        //메서드
        public void print(){
            //자기의 멤버에 접근 할수있다
            System.out.println(innnerInstanceValue);

            //바깥 클래스의 인스턴스 멤버에 접근 할수있다, private도 접근 가능(같은 클래스 안에 있으므로)
            System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에 접근 할수있다, private도 접근 가능
            System.out.println(outClassValue);

        }
    }
}
