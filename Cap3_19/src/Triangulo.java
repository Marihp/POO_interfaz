public class Triangulo {
    public double lado;

    // Metodo constructor
    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double perimetro(){
        return lado * 3;
    }
    public double altura(){
        return Math.sqrt(3) / 2 * lado;
    }

    public double area(){
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }
}
