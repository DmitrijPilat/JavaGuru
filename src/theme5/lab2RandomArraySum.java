package theme5;

import java.util.Random;

public class lab2RandomArraySum {

    public static void SumArray() {
        int array[] = new int[10];
        Random random = new Random();
        int sum = 0;

        for( int i = 0; i< 10; i++ ) {
            int n = random.nextInt(100);
            array[i] = n;
            System.out.println(n);
            sum += array[i];
        }

        System.out.println("The sum of random array is = " + sum);

    }

    public static void main(String[] args) {
        SumArray();


    }
}
