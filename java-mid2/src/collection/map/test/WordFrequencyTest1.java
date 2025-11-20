package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 1. 단어를 공백 기준으로 나누기
        String[] words = text.split(" ");

        // 2. Map 생성
        Map<String, Integer> wordCount = new HashMap<>();

        // 3. 반복문으로 단어 순회하면서 Map에 저장
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // 4. 결과 출력
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
