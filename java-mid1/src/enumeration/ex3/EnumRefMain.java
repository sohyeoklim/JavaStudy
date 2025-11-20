package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("class BASIC = " + refValue(Grade.BASIC));
        System.out.println("class GOLD = " + refValue(Grade.GOLD));
        System.out.println("class DIAMOND = " + refValue(Grade.DIAMOND));
    }

    
    //참조값을 보주는 함수
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
