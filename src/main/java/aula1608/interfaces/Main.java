package aula1608.interfaces;

public class Main {
    public static void MostrarAreaForma(Forma forma){
        System.out.println("Area: " + forma.calculaArea());
        System.out.println("Perimetro: "+ forma.calculaPeri());
    }

    public static void main(String[] args) {
        Forma triangulo = new Triangulo(8, 6);
        MostrarAreaForma(triangulo);
    }
}
