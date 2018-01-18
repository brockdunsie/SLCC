import javax.swing.*;

public class Digit extends JComponent{
    Rectangle tl,bl,tm,m,bm,tr,br;
    public Digit(){
        super();
        this.setSize(60,100);
        this.setVisible(true);
        this.setLayout(null);
        tl = new Rectangle(0,50,30,50);
        bl = new Rectangle(0,130,30,50);
        tm = new Rectangle(30,20,50,30);
        m = new Rectangle(30,100,50,30);
        bm = new Rectangle(30, 180, 50, 30);
        tr = new Rectangle(80,50,30,50);
        br = new Rectangle(80,130,30,50);
        this.add(tl,0);
        this.add(bl,0);
        this.add(tm,0);
        this.add(m,0);
        this.add(bm,0);
        this.add(tr,0);
        this.add(br,0);
    }

}
