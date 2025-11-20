package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3car = new K3Car();
        Model3 model3 = new Model3();

        driver.setModel3(model3);
        driver.drive();
    }
}
