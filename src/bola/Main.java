package bola;

public class Main {
    public static void main(String[] args) {
        Bola bola = new Bola();

        System.out.println("Cor da bola é " + bola.mostraCor());

        bola.trocaCor("Azul");

        System.out.println("Cor da bola após a troca é " + bola.mostraCor());
    }
}
