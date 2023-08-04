package aula0408.atividade;

import java.util.List;

public class Banco {

    Cliente gabriel = new Cliente("Gabriel", 22, "48253498712");
    Cliente pedro = new Cliente("Pedro", 21, "26489365485");
    Cliente clara = new Cliente("Clara", 52, "412356896354");

    Conta conta1 = new Conta(1234, 23500.0, gabriel);
    Conta conta2 = new Conta(2345, 1600.0, pedro);
    Conta conta3 = new Conta(3456, 3500.0, clara);

    private List<Conta> contas;

    public void criarConta(Cliente cliente){
        Conta conta = new Conta(0, 0, cliente);
        this.contas.add(conta);
    }

    public Conta buscarConta(int numeroConta){
        for (Conta conta : contas){
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public List<Conta> listarContas(){
        return contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "gabriel=" + gabriel +
                ", pedro=" + pedro +
                ", clara=" + clara +
                ", conta1=" + conta1 +
                ", conta2=" + conta2 +
                ", conta3=" + conta3 +
                ", contas=" + contas +
                '}';
    }
}
