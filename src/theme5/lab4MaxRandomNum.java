package theme5;

import java.util.Random;

public class lab4MaxRandomNum {

    public static void MaxArray() {

        Random random = new Random();
        int array[] = new int[10];
        int max = array[0];

        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(100);
            array[i] = n;
            System.out.println(n);

            if (array[i] > max) {
            max = array[i];
            }


        }
        System.out.println("----------------------------");
        System.out.println("Max: "+ max);
    }

    public static void main(String[] args) {
        MaxArray();
    }
}
