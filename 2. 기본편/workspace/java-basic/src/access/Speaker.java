package access;

public class Speaker {
    //private 붙은 경우 해당 클래스 내부에서만 호출할수 있음, 외부접근 막는다
    int volume;

    //생성자를 통해서 초기음량값 지정함
    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }else{
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
