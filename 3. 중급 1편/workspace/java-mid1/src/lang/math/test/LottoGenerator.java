package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random= new Random(); //Random 클래스 생성
    private int[] lottoNumbers;
    private int count;

    //배열형태로 로또번호 반환
    public int[] generate(){
        lottoNumbers = new int[6];
        count = 0;

        while (count < lottoNumbers.length){
            //1부터 45 사이의 숫자를 생성
            int number = random.nextInt(45) + 1;
            //중복되는 않는 경우에만 배열에 추가
            if(isUnique(number)){
                lottoNumbers[count] = number; //true이면 배열에 값을 추가
                count++;
            }
        }
        return lottoNumbers;
    }

    //이미 생선된 번호와 중복되는지 검사하는 메서드
    private boolean isUnique(int number){
        for (int i = 0; i < count; i++){
            if (lottoNumbers[i] == number){
                return false; //같은 수이면 false
            }
        }
        return true;
    }
}
