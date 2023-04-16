import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class InterfazPotencias extends JFrame implements ActionListener {
    private JTextField valorAField;
    private JLabel valorALabel;
    private JTextField valorBField;
    private JLabel valorBLabel;
    private JButton calcularButton;

    public InterfazPotencias() {
        // Configurar ventana
        setTitle("Calcular potencias");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Ventana en el centro
        setLayout(new GridLayout(6, 2, 20, 5));
        getRootPane().setBorder(new EmptyBorder(10,10,10,10));

        // Crear etiquetas y campos de texto
        valorALabel = new JLabel("Ingrese el valor A:");
        valorAField = new JTextField();
        valorBLabel = new JLabel("Ingrese el valor B:");
        valorBField = new JTextField();

        // Crear boton de calcular
        calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);

        // Agregar etiquetas y campos de texto a la ventana
        add(valorALabel);
        add(valorAField);
        add(valorBLabel);
        add(valorBField);
        add(calcularButton);

        // Mostrar ventana
        setVisible(true);
    }

    // Metodo para manejar el evento de clic en el boton
    public void actionPerformed(ActionEvent e) {
        // Obtener datos del formulario
        double A = Double.parseDouble(valorAField.getText());
        double B = Double.parseDouble(valorBField.getText());

        // Crear objeto para calcular
        Potencias potencias = new Potencias(A, B);

        // Mostrar mensaje en cuadro de dialogo

        JOptionPane.showMessageDialog(this,
                "El valor de la raiz cuadrada de A es: " +
                Potencias.calcularRaiz(A) + "\n" +
        "El valor del cuadrado de A es: " +
                Potencias.calcularCuadrado(A) + "\n" +
                "El valor del cubo de A es: " + Potencias.calcularCubo(A) +"\n"
                + "\n" + "El valor de la raiz cuadrada de B es: " +
                Potencias.calcularRaiz(B) + "\n" +
                "El valor del cuadrado de B es: " +
                Potencias.calcularCuadrado(B) + "\n" +
                "El valor del cubo de B es: " + Potencias.calcularCubo(B));
    }

    public static void main(String[] args) {
        new InterfazPotencias();
    }
}

