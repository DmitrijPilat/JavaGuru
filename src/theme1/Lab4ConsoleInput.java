package theme1;

import java.util.Scanner;

public class Lab4ConsoleInput{
    public static void main(String[] args) {
        Scanner enter= new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = enter.nextInt();
        System.out.println("you entered number : " + number);
        System.out.println("Program finished, bye!");
    }
}
