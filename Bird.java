import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Bird extends ClickPic implements MouseListener {
    protected String p = "Eagle.png";

    public Bird(String n, PictureFrame w) {
        super(150, 150, 100, 100,"Eagle.png", n, w);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void changeImage() {
        count ++;
        count%=3;
        switch (count) {
            case 0:
                setImage("eagle.png");
                break;
            case 1:
                setImage("goose.png");
                break;
            case 2:
                setImage("heron.png");
                break;
            case 3:
                setImage("owl.png");
                break;
        }
    }
}
