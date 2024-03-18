import java.util.ArrayList;

public class Game {
    ArrayList <Player> players = new ArrayList<>();
    private Player player1;
    private Player player2;
    private int playersTurn;
    private Player winner;

    public Game() {
        player1.setName("Hynek");
        player1.setTag("X");
        player2.setName("Faktor");
        player2.setTag("O");
        players.add(player1);
        players.add(player2);
        playersTurn = 0;

        System.out.println(players.get(playersTurn).getName() + " choose a box you want to put your tag");




    }
}
