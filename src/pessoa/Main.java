package pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pedro", 18, 175.0F);

        System.out.println("Nome:   " + pessoa.getNome());
        System.out.println("Idade:  " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Peso:   " + pessoa.getPeso());

        pessoa.engordar(70);
        pessoa.envelhecer(6);

        // mostra a alteração automática de altura com a adição de idade
        // [alt] = alterado
        System.out.println("[alt] Idade:  " + pessoa.getIdade());
        System.out.println("[alt] Altura: " + pessoa.getAltura());
        System.out.println("[alt] Peso:   " + pessoa.getPeso());
    }
}
