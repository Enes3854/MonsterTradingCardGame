package project;

import java.util.ArrayList;
import java.util.List;

// Class with getters that interacts with the 'deck' table in the database
public class Deck {
// List of cards that the deck holds
    private List<Card> cards = new ArrayList<>();
    // The constructor of the 'Deck' class checks if the deck has more than 4 cards, it does not add more cards due to game rules
    public Deck (List<Card> deck) {
        if (deck != null) {
            for (int i = 0; deck.size() > i && i < 4; i++) {
                this.cards.add(deck.get(i));
            }
        }
    }

    // Removes one card from the deck
    public void removeCard (Card card){
        if (cards != null){
            cards.remove(card);
        }
    }
// Adds one card to the deck
    public void addCard (Card card){
        if (!cards.contains(card)){
            cards.add(card);
        }
    }
    // Draws random card from deck
    public Card getRandomCard(){
        if (cards != null && cards.size() > 0){
            return cards.get((int)(Math.random() * cards.size()));
        }
        return null;
    }
// Checks if deck has no cards
    public boolean isEmpty(){
        return cards.isEmpty();
    }

    // Returns the amount of cards in deck
    public int getSize(){
        if (!isEmpty()){
            return cards.size();
        }
        return 0;
    }
}


