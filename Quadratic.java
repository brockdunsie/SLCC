import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Quadratic {
    String aText = JOptionPane.showInputDialog(null, "Enter a number for a: ");
    String bText = JOptionPane.showInputDialog(null, "Enter a number for b: ");
    String cText = JOptionPane.showInputDialog(null, "Enter a number for c: ");
    int a = Integer.parseInt(aText);
    int b = Integer.parseInt(bText);
    int c = Integer.parseInt(cText);
    double x1 = (-b + Math.sqrt(b * b + 4 * a * c)) / 2;
    double x2 = (-b - Math.sqrt(b * b + 4 * a * c)) / 2;
    JFrame win = new JFrame("Quadratic");
    win.setBounds(250,250)
}
