import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class InterfazTriangulo extends JFrame implements ActionListener {
    private JTextField ladoField;
    private JLabel ladoLabel;
    private JButton calcularButton;

    public InterfazTriangulo() {
        // Configurar ventana
        setTitle("Calcular medidas de un triángulo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Ventana en el centro
        setLayout(new GridLayout(6, 2, 20, 5));
        getRootPane().setBorder(new EmptyBorder(10,10,10,10));

        // Crear etiquetas y campos de texto
        ladoLabel = new JLabel("Ingrese la medida del lado:");
        ladoField = new JTextField();

        // Crear boton de calcular
        calcularButton = new JButton("Calcular medidas");
        calcularButton.addActionListener(this);

        // Agregar etiquetas y campos de texto a la ventana
        add(ladoLabel);
        add(ladoField);
        add(calcularButton);

        // Mostrar ventana
        setVisible(true);
    }

    // Metodo para manejar el evento de click en el boton
    public void actionPerformed(ActionEvent e) {
        // Obtener datos del formulario
        double lado = Double.parseDouble(ladoField.getText());

        // Crear objeto Triangulo
        Triangulo triangulo = new Triangulo(lado);

        // Mostrar medidas en un cuadro de dialogo

        JOptionPane.showMessageDialog(this,
                "El triángulo de lado: " + lado +"\n"+
                        "Tiene un perimetro: " + triangulo.perimetro() +"\n"+
                        "Una altura de: " + triangulo.altura() + "\n" +
                        "Un área de: " + triangulo.area());
    }

    public static void main(String[] args) {
        new InterfazTriangulo();
    }
}
