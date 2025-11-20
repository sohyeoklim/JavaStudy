package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String eng;

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String inputEng = scanner.next();

            if (inputEng.equals("q")) {
                break;
            } else {
                eng = inputEng;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String inputKor = scanner.next();
            dic.put(eng,inputKor);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String outputEng = scanner.next();

            if (outputEng.equals("q")) {
                break;
            }

            if (dic.containsKey(outputEng)) {
                System.out.println(outputEng + "의 뜻: " + dic.get(outputEng));
            } else {
                System.out.println(outputEng + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}