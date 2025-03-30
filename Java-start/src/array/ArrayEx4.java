package array;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

            total += numbers[i];
        }
        double avg = total / numbers.length;
        System.out.println("입력한 정수의 합 : " + total);
        System.out.println("입력한 정수의 평균 : " + avg);
    }
}
