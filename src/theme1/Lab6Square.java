package theme1;

import java.util.Scanner;

public class Lab6Square {
    public static void main(String[] args) {
        System.out.println("This program will perform Exponentiation of 2nd form");
        System.out.println("Enter whole number");
        Scanner enter =new Scanner(System.in);
        double output = enter.nextDouble();
        //main calculation happens here. Math works only with double types!
        System.out.println("Exponentiation of 2nd form =" + Math.pow(output,2));
        System.out.println("Program finished, bye!");
    }
}
