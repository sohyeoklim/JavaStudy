package array;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인덱스를 입력하세요 : ");
        int index = scanner.nextInt();

        int[] numbers = new int[index];
        int total = 0;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

            total += numbers[i];
        }
        double avg = (double) total / numbers.length;
        System.out.println("입력한 정수의 합 : " + total);
        System.out.println("입력한 정수의 평균 : " + avg);
    }
}
