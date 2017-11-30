import java.util.Random;

public class Ball extends Oval
{
    private int fastX;
    private int fastY;
    private boolean collision = false;
    private int top;
    private int toptwo;
    private int left;
    private int lefttwo;
    private int right;
    private int righttwo;
    private int bottom;
    private int bottomtwo;
    private boolean done;
    public Ball(int x, int y, int w, int h){
        super(x,y,w,h);
        Random num = new Random();
        fastX = num.nextInt(20)+2;
        fastY = num.nextInt(20)+2;
    }
    public void fast(){
        int x = this.getX();
        int y = this.getY();
        if(x>=350){
            fastX*=-1;
        }
        if(x<=0){
            fastX*=-1;
        }
        if(y<=1)
        {
            fastY*=-1;
        }
        if(y>=499)
        {
            fastY*=-1;
        }
        this.setLocation(x+fastX,y+fastY);
    }
    public boolean collide()
    {
        int x = this.getX();
        int y = this.getY();
        if(x>=320&&y<=25)
        {
            this.setVisible(false);
            done = true;
        }
//        top right
        if(x<=25&&y<=25)
        {
            this.setVisible(false);
            done = true;
        }
//        top left
        if(x>=320&&y>=435)
        {
            this.setVisible(false);
            done = true;
        }
//        bottom right
        if(x<=25&&y>=435)
        {
            this.setVisible(false);
            done = true;
        }
        return done;
    }
//    public boolean collide(int lefttwo, int righttwo, int bottomtwo, int toptwo){
//
//    int x = this.getWidth();
//    int y = this.getHeight();
//    int top = this.getX();
//    int bottom = top + y;
//    int left = this.getY();
//    int right = left + x;
//    if(bottomtwo > top || toptwo > bottom && lefttwo > right || righttwo > left)
//    {
//        this.setVisible(false);
//    }
//    return collision;
//}

}
