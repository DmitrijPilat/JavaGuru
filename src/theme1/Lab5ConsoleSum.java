package theme1;

import java.util.Scanner;
public class Lab5ConsoleSum {

    public static void main(String[] args) {
        System.out.println("Enter 1st number : ");
        Scanner enter1= new Scanner(System.in);
        int number1 = enter1.nextInt();
        System.out.println("Enter 2nd number : ");
        Scanner enter2= new Scanner(System.in);
        int number2 = enter2.nextInt();
        int result= number1+number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " = " + result);
        System.out.println("Program finished, bye!");
    }
}
