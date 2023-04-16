public class Mayor {
    double A;
    double B;

    public Mayor(double A, double B) {
        this.A = A;
        this.B = B;
    }

    public String encontrarMayor() {
        if (A > B) {
            return ("El mayor es" + A);
        } else {
            if (A == B) {
                return (A + " es igual a " + B);
            } else {
                return ("El mayor es " + B);
            }
        }
    }
}
