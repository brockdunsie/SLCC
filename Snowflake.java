import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snowflake extends Rectangle{
    private static final int SNOW1=1;
    private static final int SNOW2=2;
    private static final int SNOW3=3;
    private static final int Garrett=26;
    public static int make = 0;
    public Snowflake(int f, int x, int y) {
        super(0, 0, 2000, 2000);
        switch (f) {
            case SNOW1:
                letGo(x,y);
                break;
            case SNOW2:
                anna(x,y);
                break;
            case SNOW3:
                elsa(x,y);
                break;
            case Garrett:
                garrett();
                break;
            default:
                System.out.println("Not a Snowflake. (1-3 only)");
                break;
        }

    }
    public void letGo(int x, int y)
    {
        double angle = 0;
        int count = 0;
        while(count<20)
        {
            Polygon poly = new Polygon(x,y,40,8, angle, Color.WHITE);
            this.add(poly,0);
            angle = angle+Math.PI/9;
            count ++;
        }
    }
    public void anna(int x, int y)
    {
        double angle = 0;
        int count = 0;
        while(count<20)
        {
            Polygon poly = new Polygon(x,y,40,8, angle, Color.WHITE);
            this.add(poly,0);
            angle = angle+Math.PI/8;
            count ++;
        }
    }
    public void elsa(int x, int y)
    {
        double angle = 0;
        int count = 0;
        while(count<20)
        {
            Polygon poly = new Polygon(x,y,40,8, angle, Color.WHITE);
            this.add(poly,0);
            angle = angle+Math.PI/10;
            count ++;
        }
    }
    public void garrett()
    {
        System.out.println("Go to https://www.youtube.com/watch?v=3x1zcnKtDHg");
    }
    public static void main (String[]args)
    {
        JFrame win = new JFrame();
        win.setVisible(true);
        win.setBounds(0,0,2000,2000);
        win.setBackground(Color.black);
        int x = 0;
        int y = 0;
        while(make<3) {
            Snowflake s1 = new Snowflake(x,y,Snowflake.SNOW1);
            win.add(s1, 0);
            Snowflake s2 = new Snowflake(x+200,y, Snowflake.SNOW2);
            win.add(s2, 0);
            Snowflake s3 = new Snowflake(x+400,y,Snowflake.SNOW3);
            win.add(s3, 0);
            y = y + 200;
            System.out.print(make);
            make++;
        }
    }
}
