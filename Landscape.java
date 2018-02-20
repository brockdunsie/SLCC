import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Landscape extends ClickPic implements MouseListener {
    public Landscape(String n, PictureFrame w){
        super(0,0,700,500, "MountainFall.jpg", n, w);

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }
    @Override
    public void changeImage() {

    }
}
