package theme1;

import java.util.Scanner;

    public class Lab8QuadroRoots {
        public static void main(String[] args) {
            System.out.println("This program will find discriminant of quadratic equation");
            System.out.println("of type A*X^2 + B*X + C =0");
            System.out.println("please enter A number");
            Scanner a = new Scanner(System.in);
            double num1 = a.nextDouble();
            System.out.println("please enter B number");
            Scanner b = new Scanner(System.in);
            double num2 = b.nextDouble();
            System.out.println("please enter C number");
            Scanner c = new Scanner(System.in);
            double num3 = c.nextDouble();
            System.out.println("You typed " + num1 + "*X^2 + " + num2 + "*X + " + num3 + " =0");

            double D;
            D = (num2 * num2) - (4 * num1 * num3);
            System.out.println("Descriminant D = (b * b) - (4 * a * c) = " + D);

            if (D < 0) {
                System.out.println("корней на множестве действительных чисел нет.");
            } else {
                if (D == 0) {
                double x1;
                x1 = (-num2) / (2 * num1);
                System.out.println("корень х1 =" + x1);
            } else {
                double x1, x2;
                x1 = (-num2 + Math.sqrt(D)) / (2 * num1);
                x2 = (-num2 - Math.sqrt(D)) / (2 * num1);
                System.out.println("x1 = " + x1 + " x2 = " + x2);
            }
            }
            System.out.println("Program finished, bye!");
        }
    }