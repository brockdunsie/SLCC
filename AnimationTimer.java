import java.awt.event.*;
import javax.swing.Timer;

public abstract class AnimationTimer extends Timer implements ActionListener  {

    //Send in an amount of milliseconds

    public AnimationTimer(int millsec)
    {
    	super(millsec, null);
        addActionListener( this );
    }
    
    //program this to call the method you would like executed
    public void actionPerformed( ActionEvent e )
    {

    }
    	
}