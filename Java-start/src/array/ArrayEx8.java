package array;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생 수를 입력하세요 : ");
        int students = scanner.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][] studentsScore = new int[students][subjects.length];

        for(int i = 0; i < students; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요");

            for(int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + "점수 : ");
                studentsScore[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < students; i++) {
            int total = 0;
            double avg = 0;
            for(int j = 0; j < subjects.length; j++) {
                total += studentsScore[i][j];
            }
            avg = (double) total / subjects.length;
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + avg);
        }
    }
}
