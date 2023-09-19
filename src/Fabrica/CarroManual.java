package Fabrica;

public class CarroManual extends Car {

    public CarroManual(String manualGear) {
        super(null, manualGear);
    }

    @Override
    public void startEngine() {
        System.out.println("Ligando o motor do carro manual.");
    }
}
