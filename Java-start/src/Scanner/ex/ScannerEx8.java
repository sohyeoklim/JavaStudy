package Scanner.ex;

import java.util.Scanner;

public class ScannerEx8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num = 0;

        System.out.println("숫자를 입력하세요.(입력을 중단하려면 -1을 누르세요) : ");

        while (true) {
            num = input.nextInt();
            if(num == -1) {
                break;
            }
            sum += num;
            ++count;
        }

        double avg = (double) sum / count;
        System.out.println(avg);
    }
}
