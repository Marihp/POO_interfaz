public class Empleado {
    private final String nombres;
    private int horasTrabajadas;
    private double valorHora;

    // Metodo constructor Empleado
    public Empleado(String nombres, int horasTrabajadas,
                    double valorHora) {
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public double salario() {
        return horasTrabajadas * valorHora;
    }

    public String getNombre() {
        if (salario() > 450000){
            return "El nombre del empleado es: " + nombres + "\n" +
                    "Salario: $"+ salario();
        }
        else {
            return "El nombre del empleado es:" + nombres ;
        }

    }
}
