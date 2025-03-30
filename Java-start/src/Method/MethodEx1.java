package Method;

public class MethodEx1 {

    public static void main(String[] args) {
        double result = avg(2, 20, 30);
        System.out.println("평균값 : " + result);
    }

    public static double avg(int a, int b, int c) {
        double result = (double) (a + b + c) / 3.0;
        return result;
    }
}
