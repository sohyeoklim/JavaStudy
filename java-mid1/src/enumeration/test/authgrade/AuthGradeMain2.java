package enumeration.test.authgrade;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
        String grade = scanner.nextLine();

        ShowDisplay.showdiplay(grade, AuthGrade.valueOf(grade.toUpperCase()));
    }
}