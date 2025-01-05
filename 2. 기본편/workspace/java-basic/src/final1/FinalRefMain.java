package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //참조값 변경불가 컴파일 오류

        //참조 대상의 값은 변경 가능함
        //data.value 값은 final아님
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
