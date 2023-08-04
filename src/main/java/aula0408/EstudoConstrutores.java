package aula0408;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudoConstrutores {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<String>();
        produtos.add("sapato");
        produtos.add("Cerveja");
        produtos.add("Livro");

        Venda venda = new Venda("José", LocalDate.now(), produtos, 400.0);

    }


}
