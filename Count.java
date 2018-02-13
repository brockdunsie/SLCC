import javax.swing.*;
public class Count extends JFrame{
    private static JButton button;
    private static JButton reset;
    public static Number dig1, dig2;
    public static int x = 0;
    public static int x1 = 0;
    public static int temp = 0;
    static Counter  counter;
    public Count(){
        super("Clicker Counter");
        this.setBounds(20, 20, 1000, 1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dig1 = new Number(300,300,x);
        dig2 = new Number(430,300,x);
        this.add(dig1,0);
        this.add(dig2,0);
        counter = new Counter();
        button = new JButton(""+counter.getCount());
        button.setBounds(0, 0, 100, 100);
        reset = new JButton("Reset");
        reset.setBounds(200, 0, 100, 100);
        this.add(button);
        this.add(reset);
        button.addActionListener(counter);
        this.setVisible(true);
    }
    public static void numChange(){
        x++;
        if (x == 10){
            x = 0;
            temp += 1 ;
            if(x1 != temp){
                dig1.num(x1);
            }
                x1 += 1;
        }
        if (x1 == 6){
            x1 = 0;
            x = 0;
        }
        dig2.num(x);
        button.setText(""+counter.getCount());
    }
    }
