package Method;

public class MethodEx2 {

    public static void main(String[] args) {
        printMessage("Hello java", 5);
    }

    public static void printMessage(String message, int count) {
        for(int i= 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
