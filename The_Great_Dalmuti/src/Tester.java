import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {

        Player Mark = new RealPlayer("Mark");
        Player Alex = new RealPlayer("Alex");
        Player Petra = new RealPlayer("Petra");
        Player Tom = new RealPlayer("Tom");

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(Mark);
        players.add(Alex);
        players.add(Petra);
        players.add(Tom);
        Game game = new Game(players);

    }
}
