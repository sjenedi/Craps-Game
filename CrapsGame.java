import java.util.Random;
import java.util.Scanner;

public class CrapsGame {

    static int rollDice() {
        Random random = new Random();
        return (1 + random.nextInt(6));
    }

    static boolean rollWithPoint(int point) {
        System.out.println("point is " + point);
        int d, d1, d2;
        while (true) {
            d1 = rollDice();
            d2 = rollDice();
            d = d1+d2;
            System.out.println("You rolled " + d1 + " + " + d2 + " = " + (d1+d2));
            if(d == 7 || d == 11) {
                return false;
            } else if(d == point) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        int d1 = rollDice();
        int d2 = rollDice();
        boolean wins;
        System.out.println("You rolled " + d1 + " + " + d2 + " = " + (d1+d2));
        int d = d1+d2;
        if(d == 7 || d == 11) {
            wins = true;
        } else if(d == 2 || d == 3 || d == 12) {
            wins = false;
        }
        else {
            wins = rollWithPoint(d);
        }
        if(wins) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }

}