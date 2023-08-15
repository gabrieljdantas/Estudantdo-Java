package aula1508.polimorfismo;

public class Gato extends Animal{

    private String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("miau");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
