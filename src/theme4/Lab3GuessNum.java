package theme4;

import java.util.Random;
import java.util.Scanner;

public class Lab3GuessNum {
    public static void Guess() {

        Random random = new Random();
        Scanner guess = new Scanner(System.in);

        int hidden;
        int x;
        boolean Stop;
        Stop = false;
        do {

            hidden = random.nextInt(100);
            x = 0;

        while (x != hidden) {
            System.out.println("guess number 0 до 100");
            x = guess.nextInt();

            if (x < hidden) {
                System.out.println("> ");
                //int z = guess.nextInt();
                //break;
            } else if ( x > hidden) {
                System.out.println("<");
                //int z = guess.nextInt();
               // break;
            } else if (x == hidden) {
                System.out.println(" You guessed the number");
            }
        }
        } while (Stop);
    }

    public static void main(String[] args) {

        Guess();

    }
}
