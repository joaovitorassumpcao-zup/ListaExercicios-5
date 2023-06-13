package carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(4,"S","Fiat", 3.0);

        System.out.println("Portas: " + carro.getPortas() +
                "Modelo: " + carro.getModelo() +
                "Marca: " + carro.getMarca() +
                "Potencia: " + carro.getPotencia());

        carro.ligarCarro();
    }
}
