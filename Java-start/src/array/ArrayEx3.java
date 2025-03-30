package array;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if(i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
