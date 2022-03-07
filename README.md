# The-Great-Dalmuti
Overview:
The Great Dalmuti is a card game that I have played with my family for years. One summer I decided to test my coding abilities and see if I could recreate the game using Java, that way I can play my favorite card game anywhere in the world. I coded using Java and used object orientated programming to design my game.

How to play The Great Dalmutti?

The Great Dalmulti deck contains 80 cards. Each card is given a value between 1 and 12, except the two jokers. In the deck there is one 1, two 2's, three 3's and so on, all the way up to 12 12's. The 80 cards are shuffled and evenly distributed amongst players(best between 3 to 6 players). The way a player wins the game is by getting rid of all the cards in their hand. Players can get rid of their cards by participating in rounds. Each round starts of with a player who can play a certain amount of cards from their hand that all have the same value. The next player then needs to to play the same number of cards, all with the same card value, that is equal to or less then the previous players. If the player is unable to do so they must pass. A round is won by a player when they play cards that everyone else passed on. When a player wins they start the next round.

An example of a round would look like this: Player one plays three 10's. Player two plays three 7's. Player three plays three 5's. Player four plays three 4's. Player one plays three 3's. Player two passes. Player three passes. Player four passes.
Player one has won the round and gets to start the next round

In addition to the normal 78 cards with values between 1 and 12, there are two jokers. These jokers, which technically have the value of 13, have a special ability which is that when played in combination with another card, they can take that cards value. For example if the previous player played three 3's, someone with a joker could play two 2's combined with a joker.

Creating the game

I started by using an objecct orientated design and thought about which classes, methods, and attributes were necessary for this game to functon. I realized that my game needed a Card class, Deck class, Game class, and a Player class. 

Creating the Card class
Each card has a value, needs to be displayed, and its value needsto be compared to another cards. My card class contians an int value which is the sole attribute of the class. The value of a card can be obtained by using the getter method. The card class also has a void funciton to display the hard by printing the value to the screen with formatting. Finally the Card class overrides the base compareTo fuction to allow Cards to be compared by their values which will be necessary in the game.

The Deck Class
Creates all the required instances of the cards that make up a deck and add the cards to an arraylist of cards called deck. The deck also contains methods that dictate what a deck should be able to do. A deck can be shuffled so we have a shuffle method that shuffles the deck using collections.shuffle. We also have a display method that displays the cards in the deck neatly. We also have a method that counts how many cards are left in the deck and a boolean method that checks if the deck is empty. Finally the deck contains the vital dealCard method which takes the top card of the deck and deals it to a players hand.

THe Player Class
Every player has an atrribute of a name and a hand. Every players hand is represented by an int array of size 13 whih contains how many of each type of card a player has. Each player has a function to add or remove a card from their hand. The player class contains helper methods which count how many cards are in a players hand and if a player contains a specific card, and a method to display the hand neatly. Finally the player has a vital method to play cards. THe play method takes in how many of which card a player would like to play and removes those cards from a players hand and places them onto the field. The field is an int array that represents the current field of a round.

The Game Class
is the longest and most complex class of the programm. The game class runs the game and is the middleman between all the other classes. A game is an object which contains a deck, a field, players, and winners. The game starts by creating a new deck, shuffling it, and dealing it to all the players participating using hte dealcards method, which evenly deals cards from teh deck to players. The game class has some helper methods like get and set field as well as displayHandsOfPlayers, which displays every players hand. The most crucial method is the run method which runs the game until the game is complete. The run method runs rounds continuosly until there is a winner. Each round goes through all players and allows them to play cards from their hand. THe run method chekcs wether the cards the player played are legal through a checkIfValidPlayment methiod. Java.util.Scanner is used to record players actions. When it is a players turn the gameprints their hand and they are asked how many cards and which card value theywould like to play. Players are also given the choice to pass. Once all players -1 pass in a row the round is over, a roundwinner is declared, and a new round stars with the new round winner playing first. This goes on until a player gets rid of al their cards. 

Coming up with the design
I modeled the game using object orientated design creating each object as a class and each function as a method. I chose to model a players hand as an attribute of a player. I made the decision to track the amounts of a given card a player had insted of having eacvh player contian card of their own. In order for players to play their cards, a vital part of the game, the play method is called in the game class to obtian a new field.

