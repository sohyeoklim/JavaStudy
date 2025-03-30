package Scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("문자열을 입력하세요 : ");
            String str = scanner.nextLine();
            System.out.println(str);

            if(str.equals("exit")) {
                System.out.println("종료되었습니다.");
                break;
            }
        }
    }
}