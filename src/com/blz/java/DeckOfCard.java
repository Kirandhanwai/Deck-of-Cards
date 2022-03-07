package com.blz.java;

public class DeckOfCard {
	String[] deck = new String[52];
    String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
    String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    
    public void alignCards() {
    	int deckIndex = 0;
    	for (int i = 0; i < suit.length; i++) {
    	    for (int j = 0; j < rank.length; j++) {
    		deck[deckIndex] = rank[j] + " of " + suit[i];
    		deckIndex++;
    	    }
    	}
    }	
    	    
    
    	    public static void main(String[] args) {
    	System.out.println("Welcome to Deck Of Card Java Project");
    DeckOfCard deckofCard = new DeckOfCard();
    deckofCard.alignCards();
    System.out.println("alignCards: ");
    deckofCard.deckIndex(deckofCard);
   
    }
}


