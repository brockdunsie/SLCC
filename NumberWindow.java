import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NumberWindow {
    public static Number one, two, three, four, five, six, seven, eight, nine, zero;
    public static Digit lit;
    public static int x, y;
    public static void main(String[]args){
        JFrame framed = new JFrame();
        framed.setLayout(null);
        x = getX();
        y = getY();
        zero = new Number(x,y,0);
        x = getX();
        y = getY();
        one = new Number(x, y, 1);
        x = getX();
        y = getY();
        two = new Number(x,y,2);
        x = getX();
        y = getY();
        three = new Number(x, y, 3);
        x = getX();
        y = getY();
        four = new Number(x, y,4);
        x = getX();
        y = getY();
        five = new Number(x, y,5);
        x = getX();
        y = getY();
        six = new Number(x, y,6);
        x = getX();
        y = getY();
        seven = new Number(x, y,7);
        x = getX();
        y = getY();
        eight = new Number(x, y,8);
        x = getX();
        y = getY();
        nine = new Number(x, y,9);
        if (nine.equals(eight))
            System.out.println("Is equal");
        else
            System.out.println("Not equal");
        framed.add(zero,0);
        framed.add(one,0);
        framed.add(two, 0);
        framed.add(three,0);
        framed.add(four,0);
        framed.add(five,0);
        framed.add(six,0);
        framed.add(seven,0);
        framed.add(eight,0);
        framed.add(nine,0);
        framed.setVisible(true);
        framed.setBounds(0,0, 1650, 1650);
        framed.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private static int getX(){
        Random gen = new Random();
        x = gen.nextInt(1500);
        return x;
    }
    private static int getY(){
        Random ran = new Random();
        y = ran.nextInt(1000);
        return y;
    }
}
