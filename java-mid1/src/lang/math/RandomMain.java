package lang.math;
import java.util.*;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt" + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble : " + randomDouble);

        //범위 조회
        int randomRange = random.nextInt(10); // 0~9 사이 출력
        System.out.println(randomRange);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println(randomRange2);
    }
}
