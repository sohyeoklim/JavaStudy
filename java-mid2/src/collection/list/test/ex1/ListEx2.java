package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true)
        {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }

        result(list);
    }

    private static void result(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(list.getLast())) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}