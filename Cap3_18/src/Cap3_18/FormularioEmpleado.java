package Cap3_18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class FormularioEmpleado extends JFrame implements ActionListener {
    private JTextField codigoField, nombresField, horasTrabajadasField,
            valorHoraField, retencionFuenteField;
    private JLabel codigoLabel, nombresLabel, horasTrabajadasLabel,
            valorHoraLabel, retencionFuenteLabel;
    private JButton calcularButton;

    public FormularioEmpleado() {
        // Configurar ventana
        setTitle("Calculadora de salario de empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Ventana en el centro
        setLayout(new GridLayout(6, 2, 20, 5));
        getRootPane().setBorder(new EmptyBorder(10,10,10,10));

        // Crear etiquetas y campos de texto
        codigoLabel = new JLabel("Código del empleado:");
        codigoField = new JTextField();
        nombresLabel = new JLabel("Nombres del empleado:");
        nombresField = new JTextField();
        horasTrabajadasLabel = new JLabel("Horas trabajadas al mes:");
        horasTrabajadasField = new JTextField();
        valorHoraLabel = new JLabel("Valor de la hora trabajada:");
        valorHoraField = new JTextField();
        retencionFuenteLabel = new JLabel("Retención en la fuente (%):");
        retencionFuenteField = new JTextField();

        // Crear boton de calcular
        calcularButton = new JButton("Calcular salario");
        calcularButton.addActionListener(this);

        // Agregar etiquetas y campos de texto a la ventana
        add(codigoLabel);
        add(codigoField);
        add(nombresLabel);
        add(nombresField);
        add(horasTrabajadasLabel);
        add(horasTrabajadasField);
        add(valorHoraLabel);
        add(valorHoraField);
        add(retencionFuenteLabel);
        add(retencionFuenteField);
        add(calcularButton);

        // Mostrar ventana
        setVisible(true);
    }

    // Método para manejar el evento de click en el botón
    public void actionPerformed(ActionEvent e) {
        // Obtener datos del formulario
        String codigo = codigoField.getText();
        String nombres = nombresField.getText();
        int horasTrabajadas =
                Integer.parseInt(horasTrabajadasField.getText());
        double valorHora =
                Double.parseDouble(valorHoraField.getText());
        double retencionFuente =
                Double.parseDouble(retencionFuenteField.getText());

        // Crear objeto Empleado con los datos ingresados por el usuario
        Empleado empleado = new Empleado(codigo, nombres, horasTrabajadas,
                valorHora, retencionFuente);

        // Mostrar salario bruto y salario neto del
        // empleado en un cuadro de diálogo

        JOptionPane.showMessageDialog(this,
                "El empleado con nombre: " + nombres +"\n"+
                "Código del empleado: " + codigo +"\n"+
                "El salario bruto de " + empleado.getNombres() +
                        " es: $" + empleado.salarioBruto() +
                "\n" + "El salario neto de " + empleado.getNombres() +
                        " es: $" + empleado.salarioNeto());
    }

    public static void main(String[] args) {
        new FormularioEmpleado();
    }
}
