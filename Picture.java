import javax.swing.*;
import java.awt.Color;
/**
 * Write a description of class Picture here.
 *
 * Blake Dansie
 * August 25, 2017
 * Lesson 1- Pictures
 */
public class Picture
{
    public static void main(String[]args)
    {
        JFrame win=new JFrame("Picture");
        win.setBounds(0,0,1000,1000);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
        //PFrame
        Rectangle frame = new Rectangle(100,100,750,750);
        frame.setBackground(Color.decode("#000000"));
        win.add(frame,0);
        //Hangers
        Line left = new Line(325,100, 400, 75);
        left.setBackground(Color.decode("#000000"));
        win.add(left,0);
        Line right = new Line(475,100, 400, 75);
        right.setBackground(Color.decode("#000000"));
        win.add(right,0);
        //Back
        Rectangle back = new Rectangle(10,10,730,730);
        back.setBackground(Color.decode("#ADD8E6"));
        frame.add(back,0);
        //Mountain
        Triangle mount = new Triangle(40,740,125,150,260,740);
        mount.setBackground(Color.decode("#663300"));
        frame.add(mount,0);
        //Lake
        Oval lake = new Oval(275,700,300,40);
        lake.setBackground(Color.decode("#00FFFF"));
        frame.add(lake,0);
        //Tree
        Rectangle trunk = new Rectangle(600,640,50,100);
        trunk.setBackground(Color.decode("#8B4513"));
        frame.add(trunk,0);
        Triangle leaves = new Triangle(525,640,625,540,725,640);
        leaves.setBackground(Color.decode("#006600"));
        frame.add(leaves,0);
        //Sun
        Oval sun = new Oval(675,-10,125,125);
        sun.setBackground(Color.decode("#e6e600"));
        back.add(sun,0);
    }
}
