import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Digit extends JComponent {
    protected Rectangle tl, bl, tm, m, bm, tr, br;
    protected int r, g, b;
    protected Color colore;

    public Digit() {
        super();
        this.setSize(120, 300);
        Random gen = new Random();
        this.setVisible(true);
        this.setLayout(null);
        tl = new Rectangle(0, 50, 30, 50);
        bl = new Rectangle(0, 130, 30, 50);
        tm = new Rectangle(30, 20, 50, 30);
        m = new Rectangle(30, 100, 50, 30);
        bm = new Rectangle(30, 180, 50, 30);
        tr = new Rectangle(80, 50, 30, 50);
        br = new Rectangle(80, 130, 30, 50);
        this.add(tl, 0);
        this.add(bl, 0);
        this.add(tm, 0);
        this.add(m, 0);
        this.add(bm, 0);
        this.add(tr, 0);
        this.add(br, 0);

        r = gen.nextInt(255);
        g = gen.nextInt(255);
        b = gen.nextInt(255);
        Color color = new Color(r, g, b);
        setColor(color);
    }
    public void show()
    {
        tl.setVisible(true);
        bl.setVisible(true);
        tm.setVisible(true);
        m.setVisible(true);
        bm.setVisible(true);
        tr.setVisible(true);
        br.setVisible(true);
    }
    public void hide()
    {
        tl.setVisible(false);
        bl.setVisible(false);
        tm.setVisible(false);
        m.setVisible(false);
        bm.setVisible(false);
        tr.setVisible(false);
        br.setVisible(false);
    }
    public void setColor(Color color) {
        tl.setBackground(color);
        bl.setBackground(color);
        tm.setBackground(color);
        m.setBackground(color);
        bm.setBackground(color);
        tr.setBackground(color);
        br.setBackground(color);
    }
}
