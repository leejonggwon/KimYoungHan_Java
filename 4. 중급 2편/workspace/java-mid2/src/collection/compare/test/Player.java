package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> hand; //플레이어가 가지는 카드(5장)

    //생성자
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); //플레이어가 가지는
    }


    //덱에서 카드를 뽑는다
    public void drawCard(Deck deck){
        hand.add(deck.drawCard()); //deck 에서 카드 한 장 뽑아서 → hand 에 들어가는 역할
    }

    //hand에 있는 카드를 더하는 역할
    public int rankSum(){
        int value = 0;
        for (Card card : hand) {
            value += card.getRank();
        }
        return value;
    }

    //내패를 보여주기
    public void showHand(){
        hand.sort(null); //Card 클래스 안에 작성한 compareTo() 메서드가 정한 순서대로 정렬해 준다
        System.out.println(name + "의 카드: " + hand + ", 합계: " + rankSum());
    }

    //플레이어의 이름
    public String getName() {
        return name;
    }
}
