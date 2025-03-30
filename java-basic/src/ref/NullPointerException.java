package ref;

public class NullPointerException {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //data는 null임 NullPointerException 오류

        System.out.println(data.value);
    }
}
