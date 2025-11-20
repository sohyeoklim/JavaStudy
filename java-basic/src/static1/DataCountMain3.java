package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count" + Data3.count);

        //클래스에 직접 접근할 수 있다. 또한 객체를 통해 접근한다면 마치 count가 data3에 속한 것 처럼 보일 수 있음
        Data3 data3 = new Data3("C");
        System.out.println("C count" + Data3.count);
    }
}