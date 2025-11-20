package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        String boolString = String.valueOf(bool);
        String objString = String.valueOf(obj);
        String strString = String.valueOf(str);

        System.out.println("num의 문자열 값: " + numString);
        System.out.println("bool의 문자열 값: " + boolString);
        System.out.println("obj의 문자열 값: " + objString);
        System.out.println("str의 문자열 값: " + strString);

        String numString2 = "하이" + num;
        System.out.println("문자열 + num:" + numString2);
    }
}
