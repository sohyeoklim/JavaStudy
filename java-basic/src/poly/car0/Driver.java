package poly.car0;

public class Driver {

    private K3Car k3car;
    private Model3 model3;

    public void setK3car(K3Car k3car) {
        this.k3car = k3car;
    }

    public void setModel3(Model3 model3) {
        this.model3 = model3;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if(k3car != null) {
            k3car.startEngine();
            k3car.offEngine();
            k3car.pressAccelerator();
        } else if (model3 != null) {
            model3.startEngine();
            model3.offEngine();
            model3.pressAccelerator();
        }
    }
}