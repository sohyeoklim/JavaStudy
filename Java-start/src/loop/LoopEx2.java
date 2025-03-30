package loop;

public class LoopEx2 {

    public static void main(String[] args) {
        int count = 0;

        for(int num = 1; ; num++) {
            if(num % 2 == 0) {
                System.out.println(num);
                count++;
                if(count >= 10){
                    break;
                }
            }
        }
    }
}
