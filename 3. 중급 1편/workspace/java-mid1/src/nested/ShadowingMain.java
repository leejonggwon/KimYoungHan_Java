package nested;
//같은 이름의 바깥 변수 접근
public class ShadowingMain {

    public int value = 1;
    public int value1 = 1;

    //내부클래스
    class Inner {
        public int value = 2;
        public int value2 = 2;

        void go() {
            int value = 3; //지역변수
            int value3 = 3;

            System.out.println("value = " + value); //3 //지역변수 우선순위
            System.out.println("this.value = " + this.value); //2 //this.value 내부클래스의 인스턴스에 접근함
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value); //1 //바깥클래스이름.this.value는 바깥 클래스의 인스턴스에 접근함

            System.out.println("----------");
            System.out.println(value3);
            System.out.println(value2);
            System.out.println(value1);

        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
