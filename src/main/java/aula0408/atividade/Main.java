package aula0408.atividade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente("Gabriel", 22, "48253498712");
        Cliente pedro = new Cliente("Pedro", 21, "26489365485");
        Cliente clara = new Cliente("Clara", 52, "412356896354");
        Cliente eduardo = new Cliente("Eduardo", 25, "23454365798");

        Conta conta1 = new Conta(1234, 23500.0, gabriel);
        Conta conta2 = new Conta(2345, 1600.0, pedro);
        Conta conta3 = new Conta(3456, 3500.0, clara);

        Banco banco = new Banco();
        banco.setContas(new ArrayList<>(List.of(conta1, conta2, conta3)));
        System.out.println(banco.getContas());

        banco.criarConta(eduardo);

        System.out.println(banco.getContas());

        System.out.println(banco.listarContas());

        System.out.println(banco.buscarConta(1234));
    }
}
