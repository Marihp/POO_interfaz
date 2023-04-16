public class Ecuacion {
    double A, B, C ;


    // Metodo constructor
    public Ecuacion(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public String getSoluciones() {
        double discriminante = B * B - 4 * A * C;

        if (discriminante > 0) {
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            return "Las soluciones reales son: " + "\n" +
                    "x1 = " + x1 + "\n" +
                    "x2 = " + x2;
        }
        else if(discriminante ==0) {
            double x = -B / (2 * A);
            return "La única solución es: " + "\n" +
                    "x = " + x;
        }

        else {
            double real = -B / (2 * A);
            double img = Math.sqrt(4 * A * C - B * B) / (2 * A);
            return "Las soluciones complejas son: " + "\n" +
                    "x1 = " + real + " + " + img + "i" + "\n" +
                    "x1 = " + real + " - " + img + "i";
        }

    }

}

