import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PictureFrame extends JFrame implements ActionListener{
    private JButton imgButton;
    private Landscape land;
    public PictureFrame(){
        super();
        Landscape land = new Landscape("fall", this);
        this.setBounds(0,0,1000,1000);
        this.add(land);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
