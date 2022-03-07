import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    int[] field;
    Deck deck;
    ArrayList<Player> players;
    ArrayList<Player> winners;
    public Game(){

    }
    public Game(ArrayList<Player> newPlayers){
        deck = new Deck();
        field = new int[]{0,0};
        players = newPlayers;
        winners = new ArrayList<Player>(players.size());

        deck.shuffle();
        deck.display();


        dealCards();
        displayHandsOfPlayers();






        runGame();
        displayHandsOfPlayers();
    }

    public void dealCards(){
        while(!deck.isEmpty())
        {
            for(Player p: players) {
                if (deck.getCardsInDeck() != 0) {
                    deck.dealCard(p);
                }
                else{
                    break;
                }
            }

        }
    }

    public void displayHandsOfPlayers(){
        for(Player p: players){
            p.displayHand();
        }
    }

    public void runGame(){
        //ADD JOKERS
        //ADD BOTS
        Scanner scan = new Scanner(System.in);
        int amount = 0;
        int cardValue = 0;
        Player roundwinner = players.get(0);
        boolean gameIsLive = true;
        //handle turn system

        //start of game loops until game is over
        while(gameIsLive){

            //start of turn
            int passcounter = 0;
            int i;
            field = new int[]{0,0};
            while(true){
                System.out.println("\n" + roundwinner.getName() + " gets to start the round by playing any number of any card");
                roundwinner.displayHand();
                System.out.println("\nPlease enter the amount of cards you are playing");
                amount = scan.nextInt();
                System.out.println("Please enter the value of the card(s) you are playing");
                cardValue = scan.nextInt();
                if(checkIfValidPlayment(roundwinner, amount, cardValue, false) == true){
                    break;
                }
                System.out.println("You can not play this please try again");
            }


            setField(roundwinner.play(amount,cardValue));
            if(roundwinner.NumberOfCardsInHand() == 0){
                System.out.println(roundwinner.getName() + " has got rid of all their cards ");
                players.remove(roundwinner);
                winners.add(roundwinner);
            }
            if(players.size() == 1){
                System.out.println("Game is over");
                System.out.println("\n   Placement: ");

                for(Player pp: winners){
                    System.out.println(pp.getName() + " " + (winners.indexOf(pp) + 1));
                }
                System.out.println(players.get(0).getName() + " " + (winners.size() + 1));
                System.exit(0);
            }

            boolean roundIsLive = true;
            int z = players.indexOf(roundwinner)+1;
            boolean firstTime = true;
            while(roundIsLive){

                for(i = z; i < players.size(); i++){
                    Player p = players.get(i);
                    if(passcounter >= players.size() - 1){
                        roundwinner = p;

                        roundIsLive = false;
                        break;
                    }


                    while(true){
                        System.out.println("\nIt is "  + p.getName() + "'s turn");
                        System.out.println("\nthe current field is: " + getField()[0] + " " + getField()[1] + "'s ");
                        p.displayHand();
                        System.out.println("\nPlease play the same amount of cards with the same or less value then the field value");
                        System.out.println("If you can not play enter then you can pass by entering -1");

                        System.out.println("\nPlease enter the amount of cards you are playing");
                        amount = scan.nextInt();
                        System.out.println("Please enter the value of the card(s) you are playing");
                        cardValue = scan.nextInt();
                        if(checkIfValidPlayment(p, amount, cardValue, true) == true){
                            break;
                        }
                        System.out.println("You can not play this please try again");
                    }

                    if(amount != -1){
                        setField(p.play(amount, cardValue));
                        passcounter = 0;
                    }
                    else{
                        System.out.println(p.getName() + " has passed");
                        passcounter++;
                    }
                    //player got rid of all their cards
                    if(p.NumberOfCardsInHand() == 0){
                        System.out.println(p.getName() + " has got rid of all their cards ");
                        players.remove(p);
                        winners.add(p);
                        i--;
                    }
                    if(players.size() == 1){
                        System.out.println("Game is over");
                        System.out.println("\n   Placement: ");

                        for(Player pp: winners){
                            System.out.println(pp.getName() + " " + (winners.indexOf(pp) + 1));
                        }
                        System.out.println(players.get(0).getName() + " " + (winners.size() + 1));
                        System.exit(0);
                    }

                }
                if(firstTime == true){
                    firstTime = false;
                    z = 0;
                }

            }
        }




        //players.get(0).play(2,12);
        //displayHandsOfPlayers();


    }

    public boolean checkIfValidPlayment(Player p, int amount, int cardValue, boolean comingOut){
        if((((amount == field[0] || field[0] == 0) && ((cardValue <= field[1]) || (field[1] == 0))) && (p.doesContain(amount, cardValue) == true)) || ((amount == -1) && comingOut == true)){
            return true;
        }
        else{
            return false;
        }
    }

    public int[] getField(){
        return field;
    }

    public void setField(int[] newField){
        field = newField;
    }
}
