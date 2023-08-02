package aula2807;

public class SaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print(1);
        System.out.print(2);
        System.out.println();
        System.out.println("Oi \n Eu sou Java");
        System.out.println("Ops! Houve um erro");

        int n1 = 7;
        int n2 = 9;
        int soma = n1 + n2;
        System.out.printf("A soma de %d e %d é igual a %d", n1, n2, soma);
        System.out.println();
        String nome = "Gabriel";
        System.out.printf("Meu nome é %s", nome);
        System.out.println();
        double n3 = 3.7;
        double n4 = 2.6;
        double div = n3 / n4;

        System.out.printf("A divisão de %.2f e %.2f é %.2f", n3, n4, div);

    }
}
