package Fabrica;

public abstract class Car {

    private String automaticTransmission;
    private String manualGear;

    public Car(String automaticTransmission, String manualGear) {
        this.automaticTransmission = automaticTransmission;
        this.manualGear = manualGear;
    }

    public Car() {

    }

    public abstract void startEngine();

    public boolean hasAutomaticTransmission() {
        return automaticTransmission != null && !automaticTransmission.isEmpty();
    }

    public boolean hasManualGear() {
        return manualGear != null && !manualGear.isEmpty();
    }
}
