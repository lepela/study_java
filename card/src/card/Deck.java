package card;

public class Deck {
	Card[] cards = new Card[52];
	int count;
	{
		int c = 0;
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 13 ; j++) {
				cards[c++] = new Card(i, j);
			}
		}
	}
	
	Deck print() {
		for(Card c : cards) {
			System.out.println(c);
		}
		return this;
	}
	
	Deck shuffle() {
		for(int i = 0 ; i < cards.length ; i++) {
			int r = (int)(Math.random() * 52);
			Card tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
		return this;
	}
	
	Card pick() {
		return cards[count++];
	}
}
