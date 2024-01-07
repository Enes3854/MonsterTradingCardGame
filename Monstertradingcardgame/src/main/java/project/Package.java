package project;

import java.util.ArrayList;

// Class for a card pack that a user can purchase to add to their deck.
public class Package {
    // List where the cards will be stored in the package
    ArrayList<Card> cards = new ArrayList<Card>();

    // Maximum amount of cards that a pack can contain
    final static int MAX_SIZE = 5;


    public Package(ArrayList<Card> cards){
        if(isValid()){
            this.cards=cards;
        }
        else{
            //User input doesn't have 5 cards
        }
    }

    // A method that returns the reverse of the cards within the pack
    public ArrayList<Card> getCards(){
        return cards;
    }

    // A method that checks if the pack has the correct quantity of card
    public boolean isValid(){
        if(cards.size()==MAX_SIZE)
            return true;
        return false;
    }
}
