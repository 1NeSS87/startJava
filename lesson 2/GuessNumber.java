import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    private Player firstPlayer;
    private Player secondPlayer;
    private int compNumber;
    private boolean isWin;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        isWin = false;
        compNumber = random.nextInt(100);
        
        do {
            enterNumber(firstPlayer);
            checkNumber(firstPlayer);
            enterNumber(secondPlayer);
            checkNumber(secondPlayer);
        } while(!isWin);
    }

    public void enterNumber(Player player) {
        System.out.print(player.getName() + " enter your number:");
        player.setNumber(scan.nextInt());
    }

    public void checkNumber(Player player) {
        if(player.getNumber() == compNumber) {
            System.out.println("You win");
            isWin = true;
        } else if(player.getNumber() < compNumber) {
            System.out.println(player.getName() + " The number you entered is less");
        } else if(player.getNumber() > compNumber) {
            System.out.println(player.getName() + " The number you entered is greater");
        }
    }
}
