package lang.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        //기본형을 래퍼 클래스로 변환
        int value = 7;
        Integer boxedValue = value; //오토박싱

        //래퍼 클래스를 기본형으로
        int unBoxedValue = boxedValue; //오토언박싱

        System.out.println("boxedValue : " + boxedValue);
        System.out.println("unBoxedValue : " + unBoxedValue);
    }
}
