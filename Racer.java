public class Racer extends EzImage {
    private int count;
    private int deltaX = 0;
    private int deltaY = 10;
    public Racer(int x, int y, int w, int h, String i)
    {
        super(x, y, w, h, i);
        count=0;
    }
    public void move()
    {
            count++;
            int x = this.getX();
            int y = this.getY();
            this.setLocation(x + deltaX, y + deltaY);
            if (x <= 60 && y == 50) {
                deltaX = 0;
                deltaY = 10;
            } else if (y == 390 && x <= 390) {
                deltaX = 10;
                deltaY = 0;
            } else if (y >= 60 && x == 390) {
                deltaY = -10;
                deltaX = 0;
            } else if (y == 60 && x >= 390) {
                deltaX = -10;
                deltaY = 0;
            }
            System.out.println(count + "  " + count % 10);
    }
}
