package aula0108;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeAula010823 {

    static double mediaAritimetica(List<Double> lista){
        double media = 0;
        for (int i=0; i < lista.size(); i++ ) {
            media += lista.get(i);
        }
        return media / lista.size();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> listaNum = new ArrayList<>();
        double maior = 0;


        System.out.println("Digite 5 numeros");
        for (int i=0; i<5; i++){
            double num = sc.nextDouble();
            listaNum.add(num);
        }
        double menor = listaNum.get(1);
        for (int i=0; i< listaNum.size(); i++){
            if (listaNum.get(i) > maior){
                maior = listaNum.get(i);
            }
            if (listaNum.get(i) < menor) {
                menor = listaNum.get(i);
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println(listaNum);

        double media = mediaAritimetica(listaNum);
        System.out.println("Media: " + media);



    }

}
