import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class InterfazEcuacion extends JFrame implements ActionListener {
    private JTextField valorAField;
    private JLabel valorALabel;
    private JTextField valorBField;
    private JLabel valorBLabel;
    private JTextField valorCField;
    private JLabel valorCLabel;
    private JButton calcularButton;

    public InterfazEcuacion() {
        // Configurar ventana
        setTitle("Encontrar soluciones ecuación");
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
        valorCLabel = new JLabel("Ingrese el valor C:");
        valorCField = new JTextField();

        // Crear boton de calcular
        calcularButton = new JButton("Encontrar soluciones");
        calcularButton.addActionListener(this);

        // Agregar etiquetas y campos de texto a la ventana
        add(valorALabel);
        add(valorAField);
        add(valorBLabel);
        add(valorBField);
        add(valorCLabel);
        add(valorCField);
        add(calcularButton);

        // Mostrar ventana
        setVisible(true);
    }

    // Metodo para manejar el evento de clic en el boton
    public void actionPerformed(ActionEvent e) {
        // Obtener datos del formulario
        double A = Double.parseDouble(valorAField.getText());
        double B = Double.parseDouble(valorBField.getText());
        double C = Double.parseDouble(valorCField.getText());

        // Crear ecuacion
        Ecuacion ecuacion = new Ecuacion(A, B , C);

        // Mostrar mensaje en cuadro de dialogo

        JOptionPane.showMessageDialog(this,
                ecuacion.getSoluciones());
    }

    public static void main(String[] args) {
        new InterfazEcuacion();
    }
}