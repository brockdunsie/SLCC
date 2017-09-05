import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pythagorean {
    public static void main(String[]args){
        String aText = JOptionPane.showInputDialog(null, "Enter a value for a: ", "Input", JOptionPane.QUESTION_MESSAGE);
        String bText = JOptionPane.showInputDialog(null, "Enter a value for b: ", "Input",JOptionPane.QUESTION_MESSAGE);
        int a = Integer.parseInt(aText);
        int b = Integer.parseInt(bText);
        double c = Math.sqrt(a*a + b*b);
        System.out.println("" + c);

    }
}
