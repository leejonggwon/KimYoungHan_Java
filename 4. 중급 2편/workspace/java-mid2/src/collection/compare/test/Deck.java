package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck { //52장의 카드가 있는 카드 뭉치를 Deck 이라 한다

    private List<Card> cards = new ArrayList<>(); //카드 보관하는 공간

    //생성자
    public Deck() {
        initCard(); //rank 와 suit 를 cards 배열에 넣는다
        shuffle();  //값을 섞는다
    }


    //rank 와 suit 를 cards 배열에 넣는다
    private void initCard() {
        for(int i = 1; i < 14; i++){ //1~14
            Suit[] values = Suit.values();   //[SPADE, HEART, DIAMOND, CLUB], 배열로 반환
            for (Suit suit : values) {
                cards.add(new Card(i,suit)); //new Card(1,SPADE)→ (1,HEART)→ (1,DIAMOND)→ (1,CLUB) 하나씩 꺼낸다
            }
        }
    }


    //카드를 섞는다
    private void shuffle() {
        Collections.shuffle(cards);
    }


    //카드를 뽑는다
    public Card drawCard(){
        return cards.removeFirst(); //0번 인덱스를 제거하고 반환한다
    }

}
