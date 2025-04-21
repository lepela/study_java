package card;

import java.util.Arrays;

public class Player {
	Card[] cards = new Card[5];
	String name;
	
	Player(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + " : " + Arrays.toString(cards);
	}
}
