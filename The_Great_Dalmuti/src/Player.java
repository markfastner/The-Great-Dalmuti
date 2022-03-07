import java.util.ArrayList;

public abstract class Player {
    String name;
    int hand[];
    public Player(){
        this.name = "BLANK";
        this.hand = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0};
    }
    public Player(String name){
        this.name = name;
        this.hand = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0};
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void addCardToHand(Card c){
        int v = c.getValue();
        hand[v-1]++;
    }

    public void removeCardFromHand(int cardValue){
        hand[cardValue - 1]--;
    }

    public int[] play(int amount, int cardvalue){
        int[] field;


        hand[cardvalue - 1] -= amount;
        System.out.println("\n" + getName() + " has played " + amount + " cards with value of " + cardvalue);

            //update field


        field = new int[] {amount, cardvalue};
        return field;
    }

    public int NumberOfCardsInHand(){
        int handcounter = 0;
        for(int i = 0; i < hand.length; i++){
            for(int ii = 0; ii< hand[i]; ii++){
                handcounter++;
            }
        }
        return handcounter;
    }

    public boolean doesContain(int amount, int cardvalue){
        if(hand[cardvalue - 1] >= amount){
            return true;
        }
        else{
            return false;
        }
    }

    public void displayHand(){
        System.out.println("\nHERE IS YOUR HAND FOR " + name);
        for(int i = 0; i< hand.length; i++){
            for(int ii = 0; ii < hand[i]; ii++){
                System.out.print((i +1) + " ");
            }
        }
        System.out.println("Card count: " + NumberOfCardsInHand());
    }

}
