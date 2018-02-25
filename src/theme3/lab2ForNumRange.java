package theme3;

import java.util.Scanner;

public class lab2ForNumRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите целое число А: ");
        int a = scanner.nextInt();
        System.out.print("введите целое число B: ");
        int b = scanner.nextInt();

        if (a < b) {
            //  int sum = 0;
            for (int i = a; i < b; i++) {
                System.out.println("range number between A and B is " + i);
            }
        }
        if (a > b) {
            //  int sum = 0;
            for (int i = b; i < a; i++) {
                System.out.println("range number between A and B is " + i);
            }
        }
    }
}
