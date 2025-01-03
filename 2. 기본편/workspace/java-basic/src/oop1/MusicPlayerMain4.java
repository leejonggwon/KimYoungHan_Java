package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        //음악플레이어를 사용하는 개발자
        //호출하는 클라이언트 부분
        MusicPlayer player = new MusicPlayer();
        //음악 플레이어 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();
    }
}
