public class Comparador {
    double A;
    double B;

    public Comparador(double A, double B){
        this.A = A;
        this.B = B;
    }

    public String comparar(){
        // Comparamos los valores de A y B y escribimos un mensaje correspondiente
        if (A > B) {
            return (A + " es mayor que " + B);
        } else{
            if (A == B){
                return (A + " es igual a " + B);
            } else {
                return (A + " es menor que " + B);
            }
        }

    }



}
