package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("메서드 호출 비교");
    }

    private static boolean isSame(String x, String y) {
        return x == y;
    }
}
