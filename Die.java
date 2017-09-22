import java.awt.Color;
import java.util.Random;
import javax.swing.*;
public class Die extends Rectangle{
    private Oval TLeft;
    private Oval TRight;
    private Oval MLeft;
    private Oval Middle;
    private Oval MRight;
    private Oval BLeft;
    private Oval BRight;
    private static int value;
    public Die(int x, int y)
    {
        super(x,y,45,45);
        TLeft = new Oval(10,10,7,7);
        TRight = new Oval(30,10,7,7);
        MLeft = new Oval(10,20,7,7);
        BLeft = new Oval(10,30,7,7);
        MRight = new Oval(30,20,7,7);
        BRight = new Oval(30,30,7,7);
        Middle = new Oval(20,20,7,7);
        this.add(TLeft,0);
        this.add(MLeft,0);
        this.add(BLeft ,0);
        this.add(Middle ,0);
        this.add(TRight,0);
        this.add(MRight ,0);
        this.add(BRight ,0);
        this.setBackground(Color.gray);
    }
    public static void Roll(){
        Random gen = new Random();
        value = gen.nextInt(6)+1;
    }
    public static void main(String[]args){
        Roll();
        JFrame win = new JFrame("Dice");
        win.setVisible(true);
        win.setBounds(0,0,500,500);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Die die1 = new Die(50,50);
        win.add(die1,0);
}
}