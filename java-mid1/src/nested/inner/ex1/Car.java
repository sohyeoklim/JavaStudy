package nested.inner.ex1;

import javax.xml.stream.events.EndDocument;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        Engine engine = new Engine(this);
    }

    public String getModel() {
        return model;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }
}
