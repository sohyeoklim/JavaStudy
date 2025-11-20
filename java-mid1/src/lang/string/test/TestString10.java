package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {

        String fruits = "apple,banana,mango";

        String[] result = fruits.split(",");
        for (String string : result) {
            System.out.println(string);
        }

        String result2 = String.join("->", result);
        System.out.println(result2);
    }
}