package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Car myCar = new G80();
        Driver driver = new Driver();
        driver.setCar(myCar);

        driver.Drive();
    }
}
