package aula31.exemploAbstrato;

public class Retangulo extends Figura{

    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Retangulo(){
        setNomeFigura("Retangulo");
    }
    @Override
    public double calculaArea() {
        return base*altura;
    }

    @Override
    public double calculePerimentro() {
        return 2*base+2*altura;
    }
}
