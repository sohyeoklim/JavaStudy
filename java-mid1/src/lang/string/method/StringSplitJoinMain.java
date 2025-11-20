package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split(), "," 기준으로 자르고 각각 출력
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        //join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열: " + joinedStr);

        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
