//import javafx.embed.swing.JFXPanel;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.Random;
//
//public class Snowflake extends Rectangle{
//    private static final int SNOW1=1;
//    private static final int SNOW2=2;
//    private static final int SNOW3=3;
//    private static final int Garrett=26;
//    private int deltaX = 0;
//    private int deltaY = 30;
//    public static int make = 0;
//    public Snowflake(int f, int x, int y) {
//
//        super(x, y, 110, 110);
//        this.setBackground(new Color(1,1,1, 1));
//        switch (f) {
//            case SNOW1:
//                letGo(50,50);
//                break;
//            case SNOW2:
//                anna(50,50);
//                break;
//            case SNOW3:
//                elsa(50,50);
//                break;
//            case Garrett:
//                garrett();
//                break;
//            default:
//                System.out.println("Not a Snowflake. (1-3 only)");
//                break;
//        }
//
//    }
//    public void letGo(int x, int y)
//    {
//        double angle = 0;
//        int count = 0;
//        while(count<20)
//        {
//            Polygon poly = new Polygon(x,y,20,8, angle, Color.WHITE);
//            this.add(poly,0);
//            angle = angle+Math.PI/9;
//            count ++;
//        }
//    }
//    public void anna(int x, int y)
//    {
//        double angle = 0;
//        int count = 0;
//        while(count<20)
//        {
//            Polygon poly = new Polygon(x,y,20,8, angle, Color.WHITE);
//            this.add(poly,0);
//            angle = angle+Math.PI/8;
//            count ++;
//        }
//    }
//    public void elsa(int x, int y)
//    {
//        double angle = 0;
//        int count = 0;
//        while(count<20)
//        {
//            Polygon poly = new Polygon(x,y,20,8, angle, Color.WHITE);
//            this.add(poly,0);
//            angle = angle+Math.PI/10;
//            count ++;
//        }
//    }
//    public void move(){
//        int x = this.getX();
//        int y = this.getY();
//        this.setLocation(x , y + deltaY);
//    }
//    public void garrett()
//    {
//        System.out.println("Go to https://www.youtube.com/watch?v=3x1zcnKtDHg");
//    }
//    public static void main (String[]args) {
//        JFrame win = new JFrame();
//        win.setVisible(true);
//        win.setBounds(0, 0, 2000, 2000);
//        win.setLayout(null);
//        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        win.getContentPane().setBackground(Color.black);
//        win.repaint();
//    }
//}
