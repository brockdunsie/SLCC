import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Quad {
    public static void main(String[] args) {
        String itsA = JOptionPane.showInputDialog(null, "Enter a number for a: ", JOptionPane.QUESTION_MESSAGE);
        String itsB = JOptionPane.showInputDialog(null, "Enter a number for b: ", JOptionPane.QUESTION_MESSAGE);
        String itsC = JOptionPane.showInputDialog(null, "Enter a number for c: ", JOptionPane.QUESTION_MESSAGE);
        int a = Integer.parseInt(itsA);
        int b = Integer.parseInt(itsB);
        int c = Integer.parseInt(itsC);
        if(a!=0 && b*b-4*a*c>0) {
            double x1 = (-b + (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
            double x2 = (-b - (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
            JFrame win = new JFrame("Quadratic");
            win.setBounds(0, 0, 500, 500);
            JLabel solve = new JLabel("Quadratic");
            win.add(solve, 0);
            solve.setText("The answers are: " + x1 + " and " + x2);
            win.setVisible(true);
        }
        else if(b*b-4*a*c<0 && a!=0){
            JFrame win3 = new JFrame("Quadratic");
            win3.setBounds(0,0,500,500);
            JLabel wrong = new JLabel("Answers");
            win3.add(wrong,0);
            wrong.setText("The answer is an imaginary number! ");
            win3.setVisible(true);
        }
        else if (b!=0){
            double x4 = (-c/b);
            JFrame win2 = new JFrame("Quadratic");
            win2.setBounds(0,0,500,500);
            JLabel solution = new JLabel("Answers");
            win2.add(solution,0);
            solution.setText("The answer is " + x4);
            win2.setVisible(true);
        }
        else {
            JFrame win3 = new JFrame("Quadratic");
            win3.setBounds(0,0,500,500);
            JLabel wrong = new JLabel("Answers");
            win3.add(wrong,0);
            wrong.setText("Can't divide by 0! ");
            win3.setVisible(true);
        }
    }
}