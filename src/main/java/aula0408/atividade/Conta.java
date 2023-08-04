package aula0408.atividade;

public class Conta {
    private int numeroConta;
    private double saldo;

    private Cliente cliente;

    public Conta() {
    }

    public Conta(int numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor){
            System.out.println("Valor indisponivel");
        }
        else {
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
