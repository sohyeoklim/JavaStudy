package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10; //최초 한번만 할당, 초기화 가능
        //data1 = 20; // 오류

        //final 지역변수2
        final int data2 = 10;
        //data2 = 20; // 오류
        method(10);
    }

    static void method(final int param) {
        //param = 20; // 못바꿈
    }
}
