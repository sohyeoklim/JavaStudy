package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 10);
        MyUser myUser3 = new MyUser("c", 20);

        MyUser[] myUsers = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(myUsers));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(myUsers);
        System.out.println(Arrays.toString(myUsers));

        //추가
        System.out.println("IdComprator 정렬");
        Arrays.sort(myUsers, new IdComparator());
        System.out.println(Arrays.toString(myUsers));

        System.out.println("IdComprator.reverse() 정렬");
        Arrays.sort(myUsers, new IdComparator().reversed());
        System.out.println(Arrays.toString(myUsers));
    }
}
