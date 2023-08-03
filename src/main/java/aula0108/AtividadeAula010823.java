package aula0108;

import org.w3c.dom.ranges.Range;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

enum EstacoesDoAno{
    VERAO, OUTONO, INVERNO, PRIMAVERA
}


public class AtividadeAula010823 {

    public static double mediaAritimetica(List<Double> lista){
        double media = 0;
        for (double n : lista ) {
            media += n;
        }
        return media / lista.size();
    }

    public static boolean numeroPrimo(int numero){
        int limite = (int) Math.sqrt(numero) + 1;
        if (numero % 2 == 0 || numero < 2) {
            return false;
        }
        for (int divisor = 3; divisor < limite; divisor += 2) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        List<Double> listaNum = new ArrayList<>();
////        double maior = 0;
//
//
//        System.out.println("Digite 5 numeros");
//        for (int i=0; i<5; i++){
//            double num = sc.nextDouble();
//            listaNum.add(num);
//        }
//        double menor = listaNum.get(0);
//        for (int i=0; i< listaNum.size(); i++){
//            if (listaNum.get(i) > maior){
//                maior = listaNum.get(i);
//            }
//            if (listaNum.get(i) < menor) {
//                menor = listaNum.get(i);
//            }
//        }

//        double maior = Collections.max(listaNum);
//        double menor = Collections.min(listaNum);
//
//        System.out.println("Maior: " + maior);
//        System.out.println("Menor: " + menor);
//        System.out.println(listaNum);
//
//        double media = mediaAritimetica(listaNum);
//        System.out.println("Media: " + media);

        ///////////////Escreva um programa que calcule e exiba a data daqui a três semanas a partir da data atual.////////////////////

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate tresSemanas = hoje.plusWeeks(5);
        System.out.println(tresSemanas);

        ////////////Escreva um método que receba um número inteiro e retorne verdadeiro se ele for primo e falso caso contrário.
        System.out.println("Digite um numero para saber se é primo ");
        int n = sc.nextInt();
        if (numeroPrimo(n)) {
            System.out.println("É primo");
        }
        else{
            System.out.println("Não é primo");
        }


        //////Crie um enum chamado EstacoesDoAno com os valores representando as estações do ano (Verão, Outono, Inverno e Primavera). Escreva um programa que receba o mês atual do usuário e informe a estação do ano correspondente.

        System.out.println("Digite o mes do ano (1-12)");
        int mes = sc.nextInt();
        switch (mes){
            case 1:
            case 2:
            case 3:
                System.out.println(EstacoesDoAno.VERAO);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(EstacoesDoAno.OUTONO);
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(EstacoesDoAno.INVERNO);
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(EstacoesDoAno.PRIMAVERA);
                break;
        }
    }

}
