import javax.swing.*;
import java.awt.*;
import java.io.FileReader;

public class Tabel extends ButtonWindow{
    private ButtonWindowFrame win;
    public Rectangle tabel, backtabel;
    public Ball bol, manute, hole1, hole2, hole3, hole4;
    public boolean done, done1, done2;
    public JLabel fin;

    public Tabel(){
        done = false;
        done1 = false;
        done2 = false;
        win = new ButtonWindowFrame("Bounce");
        win.setBounds(0,0, 1000,1000);
        backtabel = new Rectangle(0,0,400,550);
        backtabel.setBackground(Color.decode("#128477"));
        win.add(backtabel,0);
        tabel = new Rectangle(25,25,350,500);
        tabel.setBackground(Color.decode("#ffffff"));
        win.add(tabel,0);
        win.addAnimateButton(400, 0, 100, 100);
        bol = new Ball(50,50,20,20);
        bol.setBackground(Color.decode("#cc0c0c"));
        manute = new Ball(200,200,15,15);
        manute.setBackground(Color.decode("#128477"));
        tabel.add(bol,0);
        tabel.add(manute,0);
        win.setVisible(true);
        hole1 = new Ball(325, -25, 50, 50);
        tabel.add(hole1,0);
        hole1.setBackground(Color.decode("#000000"));
        hole2 = new Ball(-25, -25, 50, 50);
        tabel.add(hole2,0);
        hole2.setBackground(Color.decode("#000000"));
        hole3 = new Ball(325, 475, 50, 50);
        tabel.add(hole3,0);
        hole3.setBackground(Color.decode("#000000"));
        hole4 = new Ball(-25, 475, 50, 50);
        tabel.add(hole4,0);
        hole4.setBackground(Color.decode("#000000"));
        fin = new JLabel("");
        fin.setVisible(true);
        fin.setBounds(50,50,150,50);
        win.add(fin,0);
    }
    public void act()
    {
        if(done == false&&done1 == false && done2 == false) {
            bol.fast();
            manute.fast();
            done1 = bol.collide();
            done2 = manute.collide();
        }
        else if(done1 == true || done2 == true)
        {
            fin.setText("Game Over");
        }

    }

    public static void main (String[]args)
    {
        new Tabel();
    }
}
