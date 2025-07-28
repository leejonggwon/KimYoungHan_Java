package collection.compare.test;

public class Card implements Comparable<Card>{
    //Comparable<Card>를 구현하면, public int compareTo(Card anotherCard) {} //Card 객체들끼리 비교할 수 있는 기준을 직접 정의할 수 있다

    private final int rank;  //카드의 숫자
    private final Suit suit; //카드의 마크

    //생성자
    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //getter
    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    //비교 implements Comparable<Card>
    //다른카드와 내카드와 정렬순서로 정렬을허는데 이 구현의 핵심이다
    @Override
    public int compareTo(Card anotherCard) {
        //조건: 숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교한다
        if(this.rank != anotherCard.rank){                       //나의 rank 와 다른 rank 가 다르면,
            return Integer.compare(this.rank, anotherCard.rank); // 나의 rank 와 다른 rank와 비교한다. compare()에 크기 비교가 설계되어 있음
        }else {                                           //rank가 같으면 suit를 비교
            return this.suit.compareTo(anotherCard.suit); //suit는 compareTo()로 사용한다, 자체의 순서를 가지고 있다.
                                                          // Enum은 이미 Comparable 을 스스로 구현하므로 compareTo()로 사용한다, Enum은 선언된 순서대로 정렬되어 있다
        }
    }


    @Override
    public String toString() {
        //2(♠) 모양으로 출력
        return  rank + "(" + suit.getIcon() + ')'; //suit로 출력하면 상수 이름이 출력이 된다
    }
}
