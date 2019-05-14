package pick4cards;

import java.util.Random;

public class Player extends Thread {

	private String[] cards;
	private String name;
	
	public Player(String[] array, String name) {
		this.cards = array;
		this.name = name;
	}
	
	@Override
	public void run() {
		//pick 4 cards at random from a deck of cards
		System.out.println(name + " has selected the first card as: " + pickRandomCard(cards));
		System.out.println(name + " has selected the second card as: " + pickRandomCard(cards));
		System.out.println(name + " has selected the third card as: " + pickRandomCard(cards));
		System.out.println(name + " has selected the fourth card as: " + pickRandomCard(cards));
	}
	
	String pickRandomCard (String[] cards) {
	    int randomCard = new Random().nextInt(cards.length);
		return cards[randomCard];
	}
	
}