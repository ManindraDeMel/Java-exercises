package comp1110.lab5;

import java.util.HashMap;
import java.util.Scanner;

public class HeadsOrTails {
    static Dice coin = new Dice(1, 3);
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextLine()) {
            String readIn =  reader.nextLine().toString();
            if (readIn.length() == 1) {
                Character guess =readIn.charAt(0);
                if (guess == 'h' || guess == 't') {
                    int roll = coin.rollDice();
                    if (roll == 1 && guess == 'h' || roll == 2 && guess == 't') {
                        System.out.println("Good guess!");
                    }
                    else {
                        System.out.println("Bad luck!");
                    }
                }
                else {
                    System.out.println("Unexpected input");
                }
            }
            else {
                System.out.println("Unexpected input");
            }
        }
    }
}
