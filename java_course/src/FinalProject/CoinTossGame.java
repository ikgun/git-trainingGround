package FinalProject;

import java.util.Scanner;

public class CoinTossGame {

    private Scanner scanner;

    public static void main(String[] args) {

        CoinTossGame ctg = new CoinTossGame();
        ctg.scanner = new Scanner(System.in);

        Player player1 = new Player(ctg.askName());
        Player player2 = new Player(ctg.askName());

        System.out.println(player1.getName() + ", please guess Heads or Tails.");

        player1.setGuess(ctg.scanner.nextLine());

        ctg.validateInput(player1);

        if (player1.getGuess().equalsIgnoreCase(Coin.HEADS)) player2.setGuess(Coin.TAILS);
        else player2.setGuess(Coin.HEADS);

        Coin coin = new Coin();
        coin.flip();

        System.out.println("The coin landed on " + coin.getSide());

        ctg.congratulate(coin, player1, player2);

        ctg.scanner.close();
    }

    private String askName() {
        System.out.println("Enter player name:");
        return scanner.nextLine();
    }

    private void validateInput(Player player) {
        while (!player.getGuess().equalsIgnoreCase(Coin.HEADS)
                && !player.getGuess().equalsIgnoreCase(Coin.TAILS)) {

            System.out.println("Please enter a valid input: Heads or Tails?");
            player.setGuess(scanner.nextLine());
        }
    }

    private void congratulate(Coin coin, Player player1, Player player2) {
        if (coin.getSide().equalsIgnoreCase(player1.getGuess())) {
            System.out.println("Congrats " + player1.getName() + ", you won!");
        } else {
            System.out.println("Congrats " + player2.getName() + ", you won!");
        }
    }
}
