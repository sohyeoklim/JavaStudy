package nested.inner.ex1;

public class CarMain {

    public static void main(String[] args) {
        Car myCar = new Car("G80", 100);
        Engine engine = new Engine(myCar);

        engine.start();
    }
}
