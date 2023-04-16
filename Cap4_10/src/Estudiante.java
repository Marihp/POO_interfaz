public class Estudiante {
    private String numeroInscripcion;
    private final String nombres;
    private double patrimonio;
    private int estratoSocial;

    // Metodo constructor Estudiante
    public Estudiante(String numeroInscripcion, String nombres,
                      double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    public double calcularMatricula(){
        double valorMatricula = 50000.0;
        if (patrimonio > 2000000 && estratoSocial > 3){
            valorMatricula = valorMatricula + (patrimonio*0.03);
        }
        return valorMatricula;
    }


}
