package Fabrica;

public class CarroAutomatico extends Car {

    public CarroAutomatico(String automaticTransmission) {
        super(automaticTransmission, null);
    }

    @Override
    public void startEngine() {
        System.out.println("Ligando o motor do carro automático.");
    }
}
