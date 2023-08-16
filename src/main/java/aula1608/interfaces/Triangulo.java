package aula1608.interfaces;

public class Triangulo implements Forma{

    private double base;
    private double altura;

    @Override
    public double calculaArea() {
        return base*altura/2;
    }

    @Override
    public double calculaPeri() {
        return base*3;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
