package theme5;


import java.util.Random;

public class lab1RandomArray {

    public static void RandomArray() {
    int array[] = new int[10];
    Random random = new Random();

   for( int i = 0; i< 10; i++ ) {
        int n = random.nextInt(100);
        array[i] = n;
        System.out.println(n);
    }
    }
    public static void main(String[] args) {
        RandomArray();
    }
}

