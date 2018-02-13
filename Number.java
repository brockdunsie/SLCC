public class Number extends Digit{
    protected int display;
    public Number(int x, int y, int display){
        this.setLocation(x,y);
        num(display);
    }
    public int getDisplay(){
        return display;
    }
    public void num(int display){
        this.display = display;
        if (display == 0)
        {
            tl.setVisible(true);
            tm.setVisible(true);
            tr.setVisible(true);
            m.setVisible(false);
            bl.setVisible(true);
            bm.setVisible(true);
            br.setVisible(true);
        }
        else if (display ==1)
        {
            tl.setVisible(false);
            tm.setVisible(false);
            tr.setVisible(true);
            m.setVisible(false);
            bl.setVisible(false);
            bm.setVisible(false);
            br.setVisible(true);
        }
        else if (display ==2)
        {
            tl.setVisible(false);
            tm.setVisible(true);
            tr.setVisible(true);
            m.setVisible(true);
            bl.setVisible(true);
            bm.setVisible(true);
            br.setVisible(false);
        }
        else if (display == 3)
        {
            tl.setVisible(false);
            tm.setVisible(true);
            tr.setVisible(true);
            m.setVisible(true);
            bl.setVisible(false);
            bm.setVisible(true);
            br.setVisible(true);
        }
        else if (display ==4)
        {
            tl.setVisible(true);
            tm.setVisible(false);
            tr.setVisible(true);
            m.setVisible(true);
            bl.setVisible(false);
            bm.setVisible(false);
            br.setVisible(true);
        }
        else if (display==5)
        {
            tl.setVisible(true);
            tm.setVisible(true);
            tr.setVisible(false);
            m.setVisible(true);
            bl.setVisible(false);
            bm.setVisible(true);
            br.setVisible(true);
        }
        else if (display==6)
        {
            tl.setVisible(true);
            tm.setVisible(true);
            tr.setVisible(false);
            m.setVisible(true);
            bl.setVisible(true);
            bm.setVisible(true);
            br.setVisible(true);
        }
        else if (display==7)
        {
            tl.setVisible(false);
            tm.setVisible(true);
            tr.setVisible(true);
            m.setVisible(false);
            bl.setVisible(false);
            bm.setVisible(false);
            br.setVisible(true);
        }
        else if (display==8)
        {
            tl.setVisible(true);
            tm.setVisible(true);
            tr.setVisible(true);
            m.setVisible(true);
            bl.setVisible(true);
            bm.setVisible(true);
            br.setVisible(true);
        }
        else if (display==9)
        {
            tl.setVisible(true);
            tm.setVisible(true);
            tr.setVisible(true);
            m.setVisible(true);
            bl.setVisible(false);
            bm.setVisible(true);
            br.setVisible(true);
        }
    }
    public boolean equals(Object v){
        if (v == null)
            return false;
        if (v == this)
            return true;
        if (v instanceof Number){
            return ((Number) v).display == this.display;
        }
        else
            return false;
    }
}
