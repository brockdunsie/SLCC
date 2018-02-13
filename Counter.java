import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Counter implements ActionListener {
    int counter = 0;
    int counted = 0;
    public Number dig1, dig2;
    public void addOne(){
        counter++;
    }
    public void subOne(){
        counter--;
    }
    public void setZero(){
        counter=0;
    }
    public int getCount(){
        if (counter>=10){
            counter = 0;
            counted+=1;
        }
        if (counted == 10){
            counted = 0;
        }
        return counter;
    }
    public void actionPerformed(ActionEvent e){
        addOne();
        System.out.println(counter);
        Count.numChange();
    }
}