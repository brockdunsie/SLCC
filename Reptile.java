import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Reptile extends ClickPic implements MouseListener{
    public Reptile(String n, PictureFrame w){
        super(100,800,100,100, "Alligator.png", n, w);

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }
    @Override
    public void changeImage() {
        count++;
        count %= 2;
        switch (count) {
            case 0:
                setImage("alligator.png");
                break;
            case 1:
                setImage("frog.png");
                break;
            case 2:
                setImage("turtle.png");
                break;
        }

    }
}
