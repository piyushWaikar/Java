import java.awt.*;
import javax.swing.*;

class flowDemo extends JFrame
{
    flowDemo()
    {
        setTitle("FLow Layout");
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        JButton[] b = new JButton[4];
        for(int i=0; i<4; i++){
            b[i]=new JButton("Button "+(i+1));
            add(b[i]);
        }
        JTextField t = new JTextField(20);
        add(t);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class flowLayout{
    public static void main(String [] args){
        new flowDemo();
    }
}

