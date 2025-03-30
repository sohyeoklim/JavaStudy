package array;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int index = scanner.nextInt();
        int[] array = new int[index];

        System.out.println(index + "개의 정수를 입력하세요");
        for(int i = 0; i < index; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for(int i = 0; i < index; i++) {
            if(array[i] < min) {
                min = array[i];
            }

            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);
    }
}
