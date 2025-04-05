package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        //ZoneId.getAvailableZoneIds(): 이용 가능한 모든 시간대(타임존) ID
        //ZoneId.of(String zoneId): 주어진 시간대 ID에 해당하는 ZoneId 객체를 반환하는 메서드
        //ZoneId.getRules(): 해당 ZoneId(시간대)의 시간대 규칙(ZoneRules)을 반환하는 메서드
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId +  " | " + zoneId.getRules());
        }
        System.out.println("----------");


        //ZoneId.systemDefault(): 현재 시스템의 기본 시간대를 가져오는 메서드
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId.systemDefault = " + zoneId);
        System.out.println("----------"); //Asia/Seoul

        //zoneId.of(): 타임존을 직접 제공해서 ZoneId를 반환한다
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId); //Asia/Seoul
    }
}
