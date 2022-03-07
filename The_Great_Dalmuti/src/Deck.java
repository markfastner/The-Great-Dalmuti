import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck =  new ArrayList<Card>(77);
    public Deck(){
        //initialize all card

        Card Joker1 = new Card(13);
        Card Joker2 = new Card(13);

        Card Peasant1 = new Card(12);
        Card Peasant2 = new Card(12);
        Card Peasant3 = new Card(12);
        Card Peasant4 = new Card(12);
        Card Peasant5 = new Card(12);
        Card Peasant6 = new Card(12);
        Card Peasant7 = new Card(12);
        Card Peasant8 = new Card(12);
        Card Peasant9 = new Card(12);
        Card Peasant10 = new Card(12);
        Card Peasant11 = new Card(12);
        Card Peasant12 = new Card(12);

        Card StoneCutter1 = new Card(11);
        Card StoneCutter2 = new Card(11);
        Card StoneCutter3 = new Card(11);
        Card StoneCutter4 = new Card(11);
        Card StoneCutter5 = new Card(11);
        Card StoneCutter6 = new Card(11);
        Card StoneCutter7 = new Card(11);
        Card StoneCutter8 = new Card(11);
        Card StoneCutter9 = new Card(11);
        Card StoneCutter10 = new Card(11);
        Card StoneCutter11 = new Card(11);

        Card Sepherd1 = new Card(10);
        Card Sepherd2 = new Card(10);
        Card Sepherd3 = new Card(10);
        Card Sepherd4 = new Card(10);
        Card Sepherd5 = new Card(10);
        Card Sepherd6 = new Card(10);
        Card Sepherd7 = new Card(10);
        Card Sepherd8 = new Card(10);
        Card Sepherd9 = new Card(10);
        Card Sepherd10 = new Card(10);

        Card Cook1 = new Card(9);
        Card Cook2 = new Card(9);
        Card Cook3 = new Card(9);
        Card Cook4 = new Card(9);
        Card Cook5 = new Card(9);
        Card Cook6 = new Card(9);
        Card Cook7 = new Card(9);
        Card Cook8 = new Card(9);
        Card Cook9 = new Card(9);

        Card Mason1 = new Card(8);
        Card Mason2 = new Card(8);
        Card Mason3 = new Card(8);
        Card Mason4 = new Card(8);
        Card Mason5 = new Card(8);
        Card Mason6 = new Card(8);
        Card Mason7 = new Card(8);
        Card Mason8 = new Card(8);

        Card Seamstress1 = new Card(7);
        Card Seamstress2 = new Card(7);
        Card Seamstress3 = new Card(7);
        Card Seamstress4 = new Card(7);
        Card Seamstress5 = new Card(7);
        Card Seamstress6 = new Card(7);
        Card Seamstress7 = new Card(7);

        Card Knight1 = new Card(6);
        Card Knight2 = new Card(6);
        Card Knight3 = new Card(6);
        Card Knight4 = new Card(6);
        Card Knight5 = new Card(6);
        Card Knight6 = new Card(6);

        Card Abbess1 = new Card(5);
        Card Abbess2 = new Card(5);
        Card Abbess3 = new Card(5);
        Card Abbess4 = new Card(5);
        Card Abbess5 = new Card(5);

        Card Baroness1 = new Card(4);
        Card Baroness2 = new Card(4);
        Card Baroness3 = new Card(4);
        Card Baroness4 = new Card(4);

        Card EarlMarshal1 = new Card(3);
        Card EarlMarshal2 = new Card(3);
        Card EarlMarshal3 = new Card(3);

        Card Bishop1 = new Card(2);
        Card Bishop2 = new Card(2);

        Card TheGreatDalmuti = new Card(1);


        //add cards to deck

        deck.add(Joker1);
        deck.add(Joker2);

        deck.add(Peasant1);
        deck.add(Peasant2);
        deck.add(Peasant3);
        deck.add(Peasant4);
        deck.add(Peasant5);
        deck.add(Peasant6);
        deck.add(Peasant7);
        deck.add(Peasant8);
        deck.add(Peasant9);
        deck.add(Peasant10);
        deck.add(Peasant11);
        deck.add(Peasant12);

        deck.add(StoneCutter1);
        deck.add(StoneCutter2);
        deck.add(StoneCutter3);
        deck.add(StoneCutter4);
        deck.add(StoneCutter5);
        deck.add(StoneCutter6);
        deck.add(StoneCutter7);
        deck.add(StoneCutter8);
        deck.add(StoneCutter9);
        deck.add(StoneCutter10);
        deck.add(StoneCutter11);

        deck.add(Sepherd1);
        deck.add(Sepherd2);
        deck.add(Sepherd3);
        deck.add(Sepherd4);
        deck.add(Sepherd5);
        deck.add(Sepherd6);
        deck.add(Sepherd7);
        deck.add(Sepherd8);
        deck.add(Sepherd9);
        deck.add(Sepherd10);

        deck.add(Cook1);
        deck.add(Cook2);
        deck.add(Cook3);
        deck.add(Cook4);
        deck.add(Cook5);
        deck.add(Cook6);
        deck.add(Cook7);
        deck.add(Cook8);
        deck.add(Cook9);

        deck.add(Mason1);
        deck.add(Mason2);
        deck.add(Mason3);
        deck.add(Mason4);
        deck.add(Mason5);
        deck.add(Mason6);
        deck.add(Mason7);
        deck.add(Mason8);

        deck.add(Seamstress1);
        deck.add(Seamstress2);
        deck.add(Seamstress3);
        deck.add(Seamstress4);
        deck.add(Seamstress5);
        deck.add(Seamstress6);
        deck.add(Seamstress7);

        deck.add(Knight1);
        deck.add(Knight2);
        deck.add(Knight3);
        deck.add(Knight4);
        deck.add(Knight5);
        deck.add(Knight6);

        deck.add(Abbess1);
        deck.add(Abbess2);
        deck.add(Abbess3);
        deck.add(Abbess4);
        deck.add(Abbess5);

        deck.add(Baroness1);
        deck.add(Baroness2);
        deck.add(Baroness3);
        deck.add(Baroness4);

        deck.add(EarlMarshal1);
        deck.add(EarlMarshal2);
        deck.add(EarlMarshal3);

        deck.add(Bishop1);
        deck.add(Bishop2);

        deck.add(TheGreatDalmuti);

    }

    public void shuffle(){
        Collections.shuffle(deck);
    }



    public void display(){
        System.out.println("CARDS IN DECK: ");
        for(Card c: deck){
            c.display();
        }
        System.out.println("\n TOTAL CARDS IN DECK: " + getCardsInDeck());
    }
    public int getCardsInDeck(){
        int counter = 0;
        for(Card c: deck){
            counter++;
        }
        return counter;
    }

    public void dealCard(Player p){
        Card c = deck.get(0);
        p.addCardToHand(c);
        deck.remove(c);
    }
    public boolean isEmpty(){
        if(deck.isEmpty() == true){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
