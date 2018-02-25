package theme3;

import java.util.Scanner;

public class Lab3EvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите целое число А: ");
        int a = scanner.nextInt();
        System.out.print("введите целое число B: ");
        int b = scanner.nextInt();

        int number;
        for (number = a; number < b; number++) {
            if ((number % 2) == 0) { // чётное
                System.out.print(number + " ");
            }
        }
    }
}

