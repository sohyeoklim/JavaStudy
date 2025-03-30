package array;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[] array1;
        array1 = new int[a];

        int[] array2 = new int[]{1, 2, 3, 4, 5};

        System.out.println(array1.length);
    }
}
