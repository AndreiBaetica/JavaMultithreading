package pick4cards;

public class PickCards {

	static String[] deck = new String[52];
	static String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
	static String[] cards = new String[13];
	
	public static void main (String[] Args) {
		
		buildDeck();
		printDeck();
		
		new Player(deck, "Alpha").start();
		new Player(deck, "Beta").start();
		new Player(deck, "Gamma").start();
		new Player(deck, "Delta").start();
		
	}
	
	private static void buildDeck() {
		
		for (int i=0; i<=8; i++) {
			cards[i] = Integer.toString(i+1);
		}
		cards[9] = "A";
		cards[10] = "J";
		cards[11] = "Q";
		cards[12] = "K";
		
		for (int i=0; i<cards.length; i++) {
			for (int x=0; x<4; x++) {
				deck[i*4+x]=cards[i]+"_"+suits[x];
			}
		}
	}
	
	private static void printDeck() {
		for (int i=0; i<deck.length; i++) {
			System.out.println(deck[i]);
		}
	}
}
