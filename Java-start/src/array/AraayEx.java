package array;

public class AraayEx {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        int count = 0;

        for(int i = 0; i < students.length; ++i)
        {
            total += students[i];
            count++;
        }

        /* 향상된 for문
        for (int student : students) {
            total += student;
            count++;
        }*/

        double avg = (double) total / count;
        System.out.println("점수총합 : " + total);
        System.out.println("평균 : " + avg);
    }
}
