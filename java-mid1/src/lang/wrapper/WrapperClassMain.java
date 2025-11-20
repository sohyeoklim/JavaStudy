package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 자바 내에서 삭제 예정, 대신에 valueOf()를 사용
        //Integer newInteger = Integer.valueOf(127); // valueOf()는 같은 참조에 있는 값들을 사용하므로 == 비교도 true 가 나옴
        Integer integerObj = Integer.valueOf(127); //-128 ~ 127 사이의 자주 사용하는 숫자 값을 재사용. 미리 만들어 놓은 값을 사용하는거라 성능에 유리
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("newInteger : " + newInteger);
        System.out.println("integerObj : " + integerObj);
        System.out.println("longObj : " + longObj);
        System.out.println("doubleObj : " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
    }
}
