import java.awt.Color;
import javax.swing.*;
public class Raceway extends ButtonWindow {
    private ButtonWindowFrame win;
    private Racer garrett, jake;
    private boolean done;
    private JLabel winner;
    private Rectangle track;
    private Rectangle red;
    public Raceway()
    {
        win = new ButtonWindowFrame("Race Time");
        win.addActButton(350, 450, 100, 25);
        garrett = new Racer(50,50,50,50,"Sanic.png");
        winner = new JLabel("Press to go . . .");
        winner.setBounds(50,450,200,25);
        win.add(winner,0);
        done = false;

        win.setBackground(Color.black);
        track = new Rectangle(50,50,400,400);
        win.add(track, 0);
        red = new Rectangle(100,100,300,300);
        win.add(red, 0);
        red.setBackground(Color.GREEN);
        win.add(garrett,0);
    }
    public void act()
    {
        garrett.move();
    }
    public static void main(String[]args)
    {

        new Raceway();
    }
}
