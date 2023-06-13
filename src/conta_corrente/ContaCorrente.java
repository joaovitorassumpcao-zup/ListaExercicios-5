package conta_corrente;

public class ContaCorrente {
    private Integer numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(Integer numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public ContaCorrente(Integer numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public void depositoConta(double deposito) {
        this.saldo += deposito;
    }

    public void saqueConta(double saque) {
        this.saldo -= saque;
    }

    // GETTERS

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }
}
