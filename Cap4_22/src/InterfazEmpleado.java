import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class InterfazEmpleado extends JFrame implements ActionListener {
    private JTextField nombresField, horasTrabajadasField,
            valorHoraField;
    private JLabel nombresLabel, horasTrabajadasLabel,
            valorHoraLabel;
    private JButton calcularButton;

    public InterfazEmpleado() {
        // Configurar ventana
        setTitle("Calculadora de salario de empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Ventana en el centro
        setLayout(new GridLayout(6, 2, 20, 5));
        getRootPane().setBorder(new EmptyBorder(10,10,10,10));

        // Crear etiquetas y campos de texto
        nombresLabel = new JLabel("Nombres del empleado:");
        nombresField = new JTextField();
        horasTrabajadasLabel = new JLabel("Horas trabajadas al mes:");
        horasTrabajadasField = new JTextField();
        valorHoraLabel = new JLabel("Valor de la hora trabajada:");
        valorHoraField = new JTextField();

        // Crear boton de calcular
        calcularButton = new JButton("Calcular salario");
        calcularButton.addActionListener(this);

        // Agregar etiquetas y campos de texto a la ventana
        add(nombresLabel);
        add(nombresField);
        add(horasTrabajadasLabel);
        add(horasTrabajadasField);
        add(valorHoraLabel);
        add(valorHoraField);
        add(calcularButton);

        // Mostrar ventana
        setVisible(true);
    }

    // Método para manejar el evento de clic en el botón
    public void actionPerformed(ActionEvent e) {
        // Obtener datos del formulario
        String nombres = nombresField.getText();
        int horasTrabajadas =
                Integer.parseInt(horasTrabajadasField.getText());
        double valorHora =
                Double.parseDouble(valorHoraField.getText());

        // Crear objeto Empleado con los datos ingresados por el usuario
        Empleado empleado = new Empleado(nombres, horasTrabajadas,
                valorHora);

        // Mostrar salario bruto y salario neto del
        // empleado en un cuadro de diálogo

        JOptionPane.showMessageDialog(this,
                "" + empleado.getNombre());
    }

    public static void main(String[] args) {
        new InterfazEmpleado();
    }
}