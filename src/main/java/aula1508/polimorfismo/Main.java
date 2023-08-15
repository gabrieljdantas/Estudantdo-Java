package aula1508.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Animal rato = new Animal("Rato", "Mamifero", "Terreno Baldio");
        System.out.println(rato.getNome());

        Animal gato = new Gato();
        Animal dog = new Cachorro();

        gato.emitirSom();
        dog.emitirSom();

    }
}
