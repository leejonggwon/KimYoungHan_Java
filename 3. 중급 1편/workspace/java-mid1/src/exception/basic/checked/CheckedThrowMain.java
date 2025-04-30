package exception.basic.checked;


public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {

        Service service = new Service();

        //예외를 처리 하지 않고, 밖으로 던지는 경우
        service.catchThrow(); //처리 안하고 다시 돌아온다

        //스택트레이스 (폭탄 발생 경로)
        //at exception.basic.checked.Client.call(Client.java:8)
        //at exception.basic.checked.Service.catchThrow(Service.java:23)
        //at exception.basic.checked.CheckedThrowMain.main(CheckedThrowMain.java:10)

        System.out.println("정상 종료 (catchThrow)"); //메서드밖으로 나갔으므로 출력되지 않는다
    }
}
