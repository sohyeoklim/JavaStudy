package static2.Ex;

public class MathArrayUtils {
    //변수는 필요없음

    //private 접근 제어자를 통해 생성자를 막아버림 즉, 객체 생성을 막아버림
    private MathArrayUtils() {

    }

    public static int sum(int[] array) {
        int result = 0;

        for(int i = 0; i < array.length; i++) {
            result += array[i];
        }

        return result;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}