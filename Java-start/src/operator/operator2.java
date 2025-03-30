package operator;

public class operator2 {

    public static void main(String[] args) {

        String result1 = "Hello" + "World";
        System.out.println(result1);

        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1 + s1 + s2);

        //문자열과 숫자 더하기
        String result3 = "a + b = " + 3.5; //이와같은 상황은 3이 문자열 "3"으로 바뀌어서 연산됨
        //자바는 String 타입에 다른 타입을 더하는 경우 다른 타입을 String 타입으로 변경하여 연산함
        System.out.println(result3);
    }
}
