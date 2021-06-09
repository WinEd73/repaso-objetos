package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{

    private int numeroDeLados;
    private double lado;
    private double area;

    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        double apotema;

        apotema = (lado/2)/Math.tan(Math.toRadians((double) 360/numeroDeLados)/2);
        area=apotema*apotema*numeroDeLados*Math.tan(Math.PI/numeroDeLados);
        return area;
    }

    public double getLado() {
       return lado;
    }
}
