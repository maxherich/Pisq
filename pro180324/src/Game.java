import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList <Player> players = new ArrayList<>();
    private Player player1 = new Player();
    private Player player2 = new Player();
    private int playersTurn;
    private Player winner;
    Scanner scanner = new Scanner(System.in);

    public Game() {
        player1.setName("Hynek");
        player1.setTag("X");
        player2.setName("Faktor");
        player2.setTag("O");
        players.add(player1);
        players.add(player2);
        playersTurn = 0;
        String playersAnswer;
        Board board = new Board();
        board.setBoardSize(3);
        System.out.println(board.createBoard());
        System.out.println(players.get(playersTurn).getName() + " choose a box you want to put your tag (example: 1 2)");
        playersAnswer = scanner.next();
        //board.addTag
        changePlayersTurn(playersTurn);








    }

    public int changePlayersTurn (int playersTurn){
        if (playersTurn == 0){
            playersTurn = playersTurn++;
        }else if (playersTurn == 1){
            playersTurn = playersTurn--;
        }
        return playersTurn;
    }
}
