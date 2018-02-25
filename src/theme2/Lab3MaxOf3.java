package theme2;

import java.util.Scanner;

import java.lang.*;


public class Lab3MaxOf3 {
    public static void main(String[] args) {
        System.out.println("введите 3 целых числа и выведите на консоль наибольшее из них, Если все числа равны то консоль напишет текст A == B == С");
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите целое число А: ");
        int a = scanner.nextInt();
        System.out.print("введите целое число B: ");
        int b = scanner.nextInt();
        System.out.print("введите целое число С: ");
        int c = scanner.nextInt();

        if(a>b && a>c) {
            System.out.println(a + " - из всех введёных значений это самое большое");
        } else if (b>c && b>a) {
            System.out.println(b + " - из всех введёных значений это самое большое");
        } else if (c>a && c>b) {
            System.out.println(c + " - из всех введёных значений это самое большое");
        } else if(a==b && b==c && a==c) {
            System.out.println(" A == B == С");
        }
        System.out.println("============================================");
        System.out.println("Program finished, bye!");
    }
}
