package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>(); //생성 시점에 T의 타입이 결정
        integerGenericBox.set(10);
        //integerGenericBox.set("문자1000"); //Integer 만 허용
        Integer integer = integerGenericBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
