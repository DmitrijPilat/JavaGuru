package theme1;

import java.util.Random;


public class Lab9Random {
    public static void main(String[] args) {
    Random random = new Random();
    int n=random.nextInt(100);
    System.out.println(n);
    int n1=random.nextInt(100);
    System.out.println(n1);
    int n2=random.nextInt(100);
    System.out.println(n2);
    int sumRand;
    sumRand=n+n1+n2;
    System.out.println("====================================");
    System.out.print("sum of 3 random numbers = ");
    System.out.print(sumRand);
    }
}
