import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class InterfazComparador extends JFrame implements ActionListener {
    private JTextField valorAField;
    private JLabel valorALabel;
    private JTextField valorBField;
    private JLabel valorBLabel;
    private JButton calcularButton;

    public InterfazComparador() {
        // Configurar ventana
        setTitle("Comparar dos valores");
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
        calcularButton = new JButton("Comparador");
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

    // Método para manejar el evento de click en el botón
    public void actionPerformed(ActionEvent e) {
        // Obtener datos del formulario
        double A = Double.parseDouble(valorAField.getText());
        double B = Double.parseDouble(valorBField.getText());

        // Crear objeto para comparar
        Comparador comparador = new Comparador(A, B);

        // Mostrar mensaje en cuadro de diálogo

        JOptionPane.showMessageDialog(this,
                comparador.comparar());
    }

    public static void main(String[] args) {
        new InterfazComparador();
    }
}

