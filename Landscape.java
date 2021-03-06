import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Landscape extends ClickPic implements MouseListener {
    public Landscape(String n, PictureFrame w){
        super(0,0,1000,1000, "MountainFall.jpg", n, w);

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }
    @Override
    public void changeImage() {
        count++;
        count %= 3;
        switch (count) {
            case 0:
                setImage("MountainFall.jpg");
                break;
            case 1:
                setImage("MountainWinter.jpg");
                break;
            case 2:
                setImage("MountainSummer.jpg");
                break;
        }

    }
}
