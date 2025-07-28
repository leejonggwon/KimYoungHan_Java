package collection.compare.test;


public class CardGameMain {
    public static void main(String[] args) {

        Deck deck = new Deck(); //카드가 만들어진다
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        //5장식 나눈다
        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);  //hand에 카드가 들어간다
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        //승리자 결정 //변수를 선언하는 동시에 값을 받는다
        Player winner = getWinner(player1, player2);

        if(winner != null){
            System.out.println(winner.getName() + " 승리 ");
        }else {
            System.out.println("무승부");
        }
    }

    //승리자 결정
    private static Player getWinner(Player player1, Player player2) {
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if(sum1 > sum2){
            return player1;
        } else if (sum1 == sum2) {
            return null;
        }else {
            return player2;
        }
    }
}
