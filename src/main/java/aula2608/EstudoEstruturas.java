package aula2608;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstudoEstruturas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println(nome);

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println(altura);

        //Calcule o IMC

        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite quantos alimentos você come? ");
        int total = entrada.nextInt();

        for ( int i = 0; i < total; i++){
            System.out.println("Você gosta de Batata");
        }
        int i = 0;
        while(i < total) {
            System.out.println("Você gosta de Feijao");
            i++;
        }
    }
}
