import javax. swing.*;
/**
 * Write a description of class Window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Window
{
    public static void main (String[]args)
    {
       JFrame win = new JFrame("Yeet");
       win.setBounds(30,30,600,600);
       win.setLayout(null);
       win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       win.setVisible(true);
    }
}
