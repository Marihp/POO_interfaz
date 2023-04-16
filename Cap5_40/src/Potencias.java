public class Potencias {
    double valorA, valorB;

    Potencias(double valorA, double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public static double calcularCubo(double valor){
        return Math.pow(valor, 3);
    }

    public static double calcularCuadrado(double valor){
        return Math.pow(valor, 2);
    }

    public static double calcularRaiz(double valor){
        return Math.sqrt(valor);
    }
}
