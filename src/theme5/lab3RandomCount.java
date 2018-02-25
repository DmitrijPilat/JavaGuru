package theme5;

import java.util.Random;

public class lab3RandomCount {

    public static void ChetNechotCount() {
        int array[] = new int[10];
        Random random = new Random();
        int Chot = 0;
        int NeChot = 0;


        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(100);
            array[i] = n;
            System.out.println(n);

            if ((n % 2) == 0) { // чётное

                Chot++;

            }
            if ((n % 2) == 1) { // нечётное+
                NeChot++;
             }
        }
        System.out.println("----------------------------");
        System.out.println(" кол-во чётных = " + Chot);
        System.out.println(" кол-во нечётных = " + NeChot);
    }

    public static void main(String[] args) {
        ChetNechotCount();
    }
}