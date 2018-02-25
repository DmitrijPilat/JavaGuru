package theme3;

import java.util.Scanner;

public class Lab4SumCount {
    public static void Range_sum() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("введите целое число А: ");
        int a = scanner.nextInt();
        System.out.print("введите целое число B: ");
        int b = scanner.nextInt();

        if (a < b) {
            int sum = 0;
            for (int i = a; i < b; i++) {
                sum += i;
            }
            System.out.println("Total sum A to B = "+sum);
        } else {
            int sum = 0;
            for (int i = b; i < a; i++) {
                sum += i;
            }
            System.out.println("Total sum A to B = "+sum);
        }
    }

        public static void main(String[] args) {
                Range_sum();
        }
}


