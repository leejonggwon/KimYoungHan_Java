package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        //로또번호 반환
        int[] lottoNumbers = generator.generate();

        //생성된 로또 번호 출력
        System.out.print("로또 번호: ");
        /*for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }*/

        for (int i = 0; i < lottoNumbers.length; i++) {
            if(i == lottoNumbers.length-1){
                System.out.print(lottoNumbers[i]);
                break;
            }
            System.out.print(lottoNumbers[i] + ", ");
        }
    }
}
