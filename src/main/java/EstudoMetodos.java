class Garrafa {
    float volume;

    public float obterVolume(){
        return this.volume;
    }
}



public class EstudoMetodos {

    // Funções que recebem Parametros e Quem não recebem
    // Funções que retornam valores e outras não retornam
    public String bemVindo(){
        return "Bem Vindo";
    }

    public void imprimir (String texto){
        System.out.println(texto);
    }

    public static double soma(double n1, double n2, double n3){
        double somaTudo = n1 + n2 + n3;
        return  somaTudo;
    }

    public static void main(String[] args) {
        double resultado = soma(12.4, 23.3, 1.3);
        System.out.println(resultado);

        Garrafa garrafa = new Garrafa();
        garrafa.volume = 1.5F;
        System.out.println(garrafa.obterVolume() + " litros");
    }



}
