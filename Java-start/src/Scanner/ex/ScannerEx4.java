package Scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요 : ");
        int n = scanner.nextInt();

        for(int i = 1; i <= 9; ++i) {
            int sum = n * i;
            System.out.println(n + "*" + i + "=" + sum);
        }
    }
}
