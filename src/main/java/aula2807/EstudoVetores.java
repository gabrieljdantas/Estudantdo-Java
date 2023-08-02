package aula2807;

import java.util.Scanner;

public class EstudoVetores {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6, 8};
        System.out.println(nums[4]);
        nums[4] = 7;
        System.out.println(nums[4]);

//        for(int i = 0; i< nums.length; i++){
//            System.out.println(nums[i]);
//        }
//
//        double[] notas = new double[60];
//        notas[59] = 5.6;
//        System.out.println(notas[59]);
//
//        for (int num : nums) {
//            System.out.println(num);
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de notas");
        int nNotas = scanner.nextInt();
        double[] notas = new double[nNotas];
        for (int i = 0; i< notas.length; i++) {
            System.out.println("Digite a nota: ");
            notas[i] = scanner.nextDouble();
        }

        double media = 0.0;
        for (double nota: notas){
            media += nota;
        }

        media /= nNotas;
        System.out.printf("A media é igual a %.2f", media);
    }
}
