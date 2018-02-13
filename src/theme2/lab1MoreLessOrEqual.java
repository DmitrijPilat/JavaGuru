package theme2;

import java.util.Scanner;

public class lab1MoreLessOrEqual {
    public static void main(String[] args) {
        System.out.println("Enter number 1) <0, 2) =0, 3) >0 : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);

        if(number<0)
           System.out.println(number + " - число отрицательное");
        else
            if(number==0)
                System.out.println(number +" - число равно 0");
        else
            if(number>0)
                System.out.println(number + " - Число положительное");
        System.out.println("====================================");
        System.out.println("Program finished, bye!");
    }
}
