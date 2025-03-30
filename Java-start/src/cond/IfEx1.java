package cond;

public class IfEx1 {

    public static void main(String[] args) {
        int score = 90;

        if(score >= 95){
            System.out.println("A학점입니다.");
        } else if(score >= 85) {
            System.out.println("B");
        } else if(score >= 75) {
            System.out.println("C");
        } else if(score >= 65) {
            System.out.println("D");
        } else if(score >= 55) {
            System.out.println("F");
        }
    }
}
