package nested.local;

public class LocalOuterV3 {

    //멤버 변수
    private int outInstanceVar = 3;

    //클래스 메서드
    public Printer process(int paramVar) {
        int localVar = 1;

        //
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남음
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);

        printer.print();

        //추가
        System.out.println("필드 확인");
        //Field[] fields = printer.getClass().getDeclaredFields();

    }
}