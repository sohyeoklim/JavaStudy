package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); //문자열 풀에 저장되있음

        System.out.println("'b' compare To 'a': " + "b".compareTo("a"));
        System.out.println("'c' compare To 'a': " + "c".compareTo("a")); //사전적으로 c와 a는 2개 차이라는 뜻
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareTo str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 start with 'Hello': " + str1.startsWith("Hello")); //Hello로 시작하는지
        System.out.println("str1 end with 'Java': " + str1.endsWith("Java!")); //Java! 로 끝나는지
    }
}
