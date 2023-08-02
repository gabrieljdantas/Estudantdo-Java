package aula2807;

public class EstudoStrings {
    public static void main(String[] args) {
        String java = "Java";
        System.out.println(java.toLowerCase());
        System.out.println(java.toUpperCase());
        System.out.println(java.charAt(2));
        System.out.println(java.indexOf("va"));
        System.out.println(java.replace("a", "o"));
        System.out.println(java.replaceAll("a", "o"));


        String nome1 = "Pedro";
        String nome2 = "Pedro";

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));
    }
}
