package theme2;

import java.util.Scanner;

public class Lab2FindMaxOf2Num {
    public static void main(String[] args) {
        System.out.println("введите 2 целых числа и вывести на консоль наибольшее из них");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число А");
        int number = sc.nextInt();
        System.out.println("введите число B");
        int number2=sc.nextInt();

        if(number<number2)
            System.out.println(number2 + " большее");
        else
        if(number==number2)
            System.out.println("A == B");
        else
        if(number>number2)
            System.out.println(number + " большее");
        System.out.println("====================================");
        System.out.println("Program finished, bye!");
    }
}
