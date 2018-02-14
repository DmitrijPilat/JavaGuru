package theme3;

import java.util.Scanner;

public class Lab2NumRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите целое число А: ");
        int a = scanner.nextInt();
        System.out.print("введите целое число B: ");
        int b = scanner.nextInt();

        int rangeTop;
        int rangeMin;

        if (a < b){
            rangeMin = a;
            rangeTop = b;
            while (rangeMin <= rangeTop) {
                System.out.println(rangeMin);
                rangeMin++;
            }

            if(a>b){
                    rangeMin = b;
                    rangeTop = a;
                    while (rangeMin <= rangeTop) {
                        System.out.println(rangeMin);
                        rangeMin++;
                    }
                }
            }
        }
    }

