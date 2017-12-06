public class Racer extends EzImage {
    private int count;
    private boolean done;
    private int deltaX = 0;
    private int deltaY = 30;
    public Racer(int x, int y, int w, int h, String i)
    {
        super(x, y, w, h, i);
        count=0;
        done = false;
    }
    public void move() {
        int x = this.getX();
        int y = this.getY();
        if (done == false) {
            count++;
            this.setLocation(x + deltaX, y + deltaY);
            if (y > 400 && x < 70) {
                this.setLocation(60,400);
                deltaX = 20;
                deltaY = 0;
            } else if (y == 400 && x > 400) {
                this.setLocation(400,400);
                deltaY = -20;
                deltaX = 0;
            } else if (y < 50 && x == 400) {
                this.setLocation(400,50);
                deltaX = -20;
                deltaY = 0;
            }
            else if(y == 50 && x == 60 && count > 0){
                deltaX = 0;
                deltaY = 0;
            }

        }
        else if (y <= 60 && x <= 60){
            deltaX = 0;
            deltaY = 0;
        }
            System.out.println(count + "  " + count % 10);
    }
}
