import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o email: ");
        String email = sc.nextLine();
        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();

        if (email.contains("@soulcode.com") && senha .length() > 8){
            System.out.println("Login confirmado");
        }
        else {
            System.out.println("Acesso negado");
        }

        System.out.println("--------------------------------------\n-------------------------------------");

        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {2, 3, 4, 5, 6};
        int[] result = new int[5];

        for (int i=0; i <result.length; i++){
            result[i] = vetor1[i] + vetor2[i];
            System.out.println(result[i]);
        }

    }
}
