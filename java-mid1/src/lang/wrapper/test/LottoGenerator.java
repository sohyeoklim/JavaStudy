package lang.wrapper.test;
import java.util.*;

public class LottoGenerator {

        private final Random random = new Random();
        private int[] lottoNumbers;
        private int count;

        public void generate() {
            lottoNumbers = new int[6]; //로또 번호 배열
            count = 0;

            //로또번호 뽑기
            while(count < 6) {
                int num = random.nextInt(45) + 1;
                boolean isDuplication = false;

                for(int i = 0; i < count; i++) {
                    //중복 판정
                    if(num == lottoNumbers[i]) {
                        isDuplication = true;
                        break;
                    }
                }
                if(!isDuplication) {
                    lottoNumbers[count] = num;
                    count++;
                }
            }

            Arrays.sort(lottoNumbers);
            System.out.println("당첨 번호");
            //출력
            for(int i = 0; i < lottoNumbers.length; i++) {
                System.out.println(lottoNumbers[i]);
            }
        }
}