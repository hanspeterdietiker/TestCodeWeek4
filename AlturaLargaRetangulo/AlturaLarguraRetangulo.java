package AlturaLargaRetangulo;

public class AlturaLarguraRetangulo {
    private double Largura;
    private double Altura;

    public AlturaLarguraRetangulo() {
        this.Largura = Largura;
        this.Altura = Altura;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getLargura() {
        return Largura;
    }

    public void setLargura(double Largura) {
        this.Largura = Largura;
    }


    public double area() {
        return Largura * Altura;
    }

    public double perimetro() {
        return 2 * (Largura + Altura);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(Largura, 2) + Math.pow(Altura, 2));
    }
}
