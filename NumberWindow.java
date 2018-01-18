import javax.swing.*;

public class NumberWindow {
    public static Digit dig;
    public static void main(String[]args){
        JFrame framed = new JFrame();
        dig = new Digit();
        framed.add(dig,0);
        framed.setVisible(true);
        framed.setBounds(0,0, 500, 500);
    }
}
