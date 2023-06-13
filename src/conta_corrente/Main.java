package conta_corrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente  = new ContaCorrente(11111, "Pedro");

        System.out.println("Saldo: " + contaCorrente.getSaldo());

        contaCorrente.depositoConta(1000);

        System.out.println("Deposito: " + contaCorrente.getSaldo());

        contaCorrente.saqueConta(12.20);

        System.out.println("Saque: " + contaCorrente.getSaldo());
    }
}
