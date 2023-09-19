package Fabrica;

public class Demo {

    public static void main(String[] args) {

        CarroAutomatico carro1 = new CarroAutomatico("TransmissaoAutomatica1");
        CarroManual carro2 = new CarroManual("ManualGear1");

        carro1.startEngine();
        carro2.startEngine();
    }
}
