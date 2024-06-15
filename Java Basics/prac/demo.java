import java.awt.*;
import java.awt.event.*;

public class demo extends Frame implements MouseListener {
    String str = "";
    Frame f;
    TextField tf;

    public demo() {
        f = new Frame("Mouse Action");
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        tf = new TextField("Mouse Event");
        tf.setColumns(20);
        f.add(tf);
        f.addMouseListener(this);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void mouseClicked(MouseEvent arg0) {
        str = "Mouse Clicked";
        tf.setText(str);
    }

    public void mouseEntered(MouseEvent arg0) {
        str = "Mouse Entered";
        tf.setText(str);
    }

    public void mouseExited(MouseEvent arg0) {
        str = "Mouse Exited";
        tf.setText(str);
    }

    public void mousePressed(MouseEvent arg0) {
        str = "Mouse Pressed";
        tf.setText(str);
    }

    public void mouseReleased(MouseEvent arg0) {
        str = "Mouse Released";
        tf.setText(str);
    }

    public static void main(String[] args) {
        new demo();
    }
}
