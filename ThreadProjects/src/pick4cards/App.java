package pick4cards;

import java.util.Random;

class Player extends Thread {

	String array[];
	
	public Player(String array[]) {
		this.array = array;
	}
	
	@Override
	public void run() {
		//pick 4 cards at random from a deck of cards
		System.out.println("A player has selected the first card as: " + pickRandomCard(array));
		System.out.println("A player has selected the second card as: " + pickRandomCard(array));
		System.out.println("A player has selected the third card as: " + pickRandomCard(array));
		System.out.println("A player has selected the forth card as: " + pickRandomCard(array));
	}
	
	String pickRandomCard (String[] array) {
	    int randomCard = new Random().nextInt(array.length);
		return array[randomCard];
	}
	
}

public class App {

	static String deck[] = new String[52];//String[52];
	static String suits[] = {"Hearts", "Diamonds", "Spades", "Clubs"};
	static String cards[] = new String[13];
	
	public static void main (String[] Args) {
		
		buildDeck();
		
		/*
		printDeck();
		
		Player p1 = new Player(deck);
		Player p2 = new Player(deck);
		p1.start();
		p2.start();
		*/
		
		new Player(deck).start();
		new Player(deck).start();
		
	}
	
	private static void buildDeck() {
		
		for (int i=0; i<=9; i++) {
			cards[i] = Integer.toString(i+1);
		}
		cards[10] = "J";
		cards[11] = "Q";
		cards[12] = "K";
		
		for (int i=0; i<cards.length; i++) {
			for (int x=0; x<4; x++) {
				//System.out.println(i+"*"+4+"+"+x+"=" + Integer.toString(i*4+x));
				deck[i*4+x]=cards[i]+"_"+suits[x];
			}
		}
		
	}
	
	private static void printDeck() {
		/*
		for (int i=0; i<cards.length; i++) {
			System.out.println(cards[i]);
		}
		System.out.println("______________");
		System.out.println("______________");
		System.out.println("______________");
		*/
		for (int i=0; i<deck.length; i++) {
			System.out.println(deck[i]);
		}
		
		
	}
}
