package nested;

public class ShadowingMain {

    public int value = 1;

    //내부클래스
    class Inner {

        public int value = 2;

        void go() {
            int value = 3; //지역변수
            System.out.println("value = " + value); // 3
            System.out.println("this.value = " + this.value); //2 //this.value 내부클래스의 인스턴스에 접근함
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value); //1 //바깥클래스이름.this는 바깥 클래스의 인스턴스에 접근함

        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();

    }

}
