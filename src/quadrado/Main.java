package quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do lado do quadrado: ");
        quadrado.setTamanhoLado(scanner.nextInt());

        System.out.println("Tamanho é " + quadrado.getTamanhoLado() + "\n" +
                "Área é " + quadrado.calcularArea());
    }
}
