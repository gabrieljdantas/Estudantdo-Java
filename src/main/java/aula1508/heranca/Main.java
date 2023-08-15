package aula1508.heranca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("batata", 8.5F, "142536");

        System.out.println(produto.getNome() + " " +  produto.getPreco());

        Livro java = new Livro("Java", 23.50F, "1234565", 250, "123.456.789");
        System.out.println(java.getNome() + " " + java.getPreco());

        Comida tapioca = new Comida("Tapioca", 10.0F, "3455677", LocalDate.of(2023, 8, 20), 100.0F);
        System.out.println(tapioca.getNome() + " " + tapioca.getPrazoDeValidade());

        Carne picanha = new Carne("Picanha", 40.0F, "4567889", LocalDate.of(2023, 9, 28), 150.0F, "Bovina");
        System.out.println(picanha.getNome() + " " + picanha.getCategoria());
    }
}
