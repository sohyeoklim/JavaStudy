package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        int a = 33;
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        //hashCode
        int hashCode = hashCode("A");
        System.out.println("hashCode = " + hashCode);

        System.out.println("A hashCode = " + hashCode("A"));
        System.out.println("A hashCode = " + hashCode("B"));
        System.out.println("AB hashCode = " + hashCode("AB"));

        //hashIndex
        int hasCodeA = hashCode("A");
        int hashIndex = hashIndex(hasCodeA);
        System.out.println("hashIndex = " + hashIndex);

        System.out.println("hashIndex(A) : " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) : " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) : " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
