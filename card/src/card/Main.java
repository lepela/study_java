package card;

public class Main {
	public static void main(String[] args) {
		play();
		String s = String.valueOf(1);
		String s2 = 1 + "";
		"1234".contains("45");
	}
	
	static void play() {
		Player[] players = new Player[4];
		Deck deck = new Deck();
		deck.shuffle();
		players[0] = new Player("새똥이");
		players[1] = new Player("개똥이");
		players[2] = new Player("소똥이");
		players[3] = new Player("말똥이");
		
		for(int i = 0 ; i < players.length ; i++) {
			for(int j = 0 ; j < players[i].cards.length ; j++) {
				players[i].cards[j] = deck.pick();
			}
		}
		
		for(Player p : players) {
			System.out.println(p);
		}
	}
}
