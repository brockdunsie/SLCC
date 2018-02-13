import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PictureButton extends JFrame implements ActionListener{
    private JButton imgButton;
    private Icon clickImage, clickImage2;
    public PictureButton(){
        super("Picture This");
        this.setLayout(null);
        this.setBounds(20,20,600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //This code makes the pictures
        Icon image1 = new ImageIcon(getClass().getResource("Image1.png"));
        Icon image2 = new ImageIcon(getClass().getResource("Image2.png"));
        clickImage = new ImageIcon(getClass().getResource("TF.gif"));
        clickImage2 = new ImageIcon(getClass().getResource("Rac.gif"));
        //Make Button
        imgButton = new JButton(image1);
        imgButton.setBounds(0,0,600,600);
        imgButton.addActionListener(this);
        imgButton.setRolloverIcon(image2);

        this.add(imgButton,0);



        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if (imgButton.getIcon().equals(clickImage2)) {
            imgButton.setIcon(clickImage);
            imgButton.setRolloverEnabled(false);
        }
        else {
            imgButton.setIcon(clickImage2);
            imgButton.setRolloverEnabled(false);
        }
    }
}
