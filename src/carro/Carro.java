package carro;

public class Carro {
    private int portas;
    private String modelo;
    private String marca;
    private double potencia;

    public Carro(int portas, String modelo, String marca) {
        this.portas = portas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public Carro(int portas, String modelo, String marca, double potencia) {
        this.portas = portas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public void ligarCarro() {
        // ?????
        System.out.println("Carro ligado");
    }

    // GETTERS

    public int getPortas() {
        return portas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPotencia() {
        return potencia;
    }
}
