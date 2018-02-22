import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mammal extends ClickPic implements MouseListener {
    public Mammal(String n, PictureFrame w) {
        super(350, 750, 250, 150, "Moose.png", n, w);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void changeImage() {
        count++;
        count %= 3;
        switch (count) {
            case 0:
                setImage("Moose.png");
                break;
            case 1:
                setImage("Bear.png");
                break;
            case 2:
                setImage("elk.png");
                break;
            case 3:
                setImage("Wolf.png");
                break;
        }
    }
}
