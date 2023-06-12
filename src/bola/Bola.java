package bola;


public class Bola {
    public float circunferencia;
    public float velocidade;
    public String cor;
    public String marca;
    public String material;

    public Bola() {
        circunferencia = 20;
        velocidade = 0;
        cor = "vermelho";
        marca = "Nike";
        material = "Borracha";
    }

    public String mostraCor() {
        return cor;
    }

    public void trocaCor(String cor) {
        this.cor = cor;
    }
}
