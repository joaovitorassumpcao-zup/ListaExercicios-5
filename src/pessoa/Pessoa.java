package pessoa;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Integer peso;
    private Float altura; // em centimetros

    // Dois construtores para tornar o valor peso opcional

    public Pessoa(String nome, Integer idade, Float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = 0;
    }

    public Pessoa(String nome, Integer idade, Float altura, Integer peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }


    public void envelhecer(int idade) {
        if (this.idade < 21) { // acrescenta altura conforme a idade
            int diff = this.idade + idade - 21;
            this.altura += (float) (0.5 * diff);
        }
        this.idade += idade;
    }

    public void engordar(int peso) {
        this.peso += peso;
    }

    public void emagrecer(int peso) {
        this.peso -= peso;
    }

    public void crescer(float altura) {
        this.altura += altura;
    }

    // GETTERS

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getPeso() {
        return peso;
    }

    public Float getAltura() {
        return altura;
    }
}
