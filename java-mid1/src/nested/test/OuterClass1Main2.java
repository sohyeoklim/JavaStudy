package nested.test;

public class OuterClass1Main2 {

    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass innerClass = outer.new InnerClass();
        innerClass.hello();
    }
}
