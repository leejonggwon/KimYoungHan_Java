package oop1;

public class MusicPlayer {
    //음악플레이어를 만들어서 제공하는 개발자
    //속성(멤버변수)
    int volume = 0;
    boolean isOn = false;

    //기능(메서드)
    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨 증가:" + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨 감소:" + volume);
    }

    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
