package quadrado;

public class Quadrado {
    private int tamanhoLado;

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(int tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public double calcularArea() {
        return this.tamanhoLado * this.tamanhoLado;
    }
}
