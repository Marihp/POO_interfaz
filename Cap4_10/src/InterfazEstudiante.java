import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class InterfazEstudiante extends JFrame implements ActionListener {
    private JTextField inscripcionField, nombresField, patrimonioField,
            estratoField;
    private JLabel inscripcionLabel, nombreslabel, patrimonioLabel,
            estratoLabel;
    private JButton calcularButton;

    public InterfazEstudiante() {
        // Configurar ventana
        setTitle("Calculadora de matricula");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Ventana en el centro
        setLayout(new GridLayout(6, 2, 20, 5));
        getRootPane().setBorder(new EmptyBorder(10,10,10,10));

        // Crear etiquetas y campos de texto
        inscripcionLabel = new JLabel("Código de inscripción:");
        inscripcionField = new JTextField();
        nombreslabel = new JLabel("Nombres del estudiante:");
        nombresField = new JTextField();
        patrimonioLabel = new JLabel("Patrimonio:");
        patrimonioField = new JTextField();
        estratoLabel = new JLabel("Estrato social:");
        estratoField = new JTextField();

        // Crear boton de calcular
        calcularButton = new JButton("Calcular matrícula");
        calcularButton.addActionListener(this);

        // Agregar etiquetas y campos de texto a la ventana
        add(inscripcionLabel);
        add(inscripcionField);
        add(nombreslabel);
        add(nombresField);
        add(patrimonioLabel);
        add(patrimonioField);
        add(estratoLabel);
        add(estratoField);
        add(calcularButton);

        // Mostrar ventana
        setVisible(true);
    }

    // Método para manejar el evento de clic en el botón
    public void actionPerformed(ActionEvent e) {
        // Obtener datos del formulario
        String numeroInscripcion = inscripcionField.getText();
        String nombres = nombresField.getText();
        double patrimonio =
                Double.parseDouble(patrimonioField.getText());
        int estratoSocial =
                Integer.parseInt(estratoField.getText());

        // Crear objeto Estudiante con los datos ingresados por el usuario
        Estudiante estudiante = new Estudiante(numeroInscripcion,
                nombres,patrimonio, estratoSocial);

        // Mostrar el valor de la matricula

        JOptionPane.showMessageDialog(this,
                "El estudiante con número de inscripción " +
                        numeroInscripcion + "\n" + "Nombre: " + nombres + "\n" +
                        "Valor a pagar de matricula $" + estudiante.calcularMatricula());
    }

    public static void main(String[] args) {
        new InterfazEstudiante();
    }
}