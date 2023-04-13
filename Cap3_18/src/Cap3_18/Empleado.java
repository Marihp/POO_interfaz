package Cap3_18;
public class Empleado {
    private String codigo;
    private final String nombres;
    private int horasTrabajadas;
    private double valorHora;
    private double retencionFuente;

    // Metodo constructor Empleado
    public Empleado(String codigo, String nombres, int horasTrabajadas,
                    double valorHora, double retencionFuente) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencionFuente = retencionFuente;
    }

    public double salarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double salarioNeto() {
        return salarioBruto() * (1-(retencionFuente/100));
    }

    public String getNombres() {
        return nombres;
    }
}
