import java.awt.*;
import java.awt.event.*;

public class demo2 {
    Frame fi, fo;
    TextField tf1, tf2, tf3, tf4, tf5, tfn;

 demo2()
{ fi = new Frame("Student Result");
fi.setSize(250, 400);
 fi.setLayout(null);
fi.setVisible(true);
 fi.addWindowListener(new WindowAdapter()
 {
 public void windowClosing(WindowEvent e)
 {
fi.dispose();
 }
});
 Label ln = new Label("Enter Name:");
ln.setBounds(10, 50, 90, 20); fi.add(ln);
 tfn = new TextField();
 tfn.setBounds(100, 50, 100, 20);
 fi.add(tfn);

 Label lm = new Label("Enter Marks:");
lm.setBounds(10, 80, 90, 20); fi.add(lm);
 Label l1 = new Label("Marathi:");
l1.setBounds(10, 110, 50, 20);
fi.add(l1); tf1 = new TextField();
tf1.setBounds(90, 110, 90, 20);
fi.add(tf1);
 Label l2 = new Label("Hindi:");
l2.setBounds(10, 140, 50, 20);
fi.add(l2); tf2 = new
TextField(); tf2.setBounds(90,
140, 90, 20); fi.add(tf2);
 Label l3 = new Label("English:");
l3.setBounds(10, 170, 50, 20); fi.add(l3);
 tf3 = new TextField();
tf3.setBounds(90, 170, 90, 20); fi.add(tf3);
 Label l4 = new Label("Maths:");
l4.setBounds(10, 200, 50, 20); fi.add(l4);
tf4 = new TextField(); tf4.setBounds(90, 200,
90, 20);
 fi.add(tf4);
 Label l5 = new Label("Science:");
l5.setBounds(10, 230, 50, 20);
fi.add(l5); tf5 = new TextField();
tf5.setBounds(90, 230, 90, 20);
fi.add(tf5);
 Button b = new Button("Submit");
b.setBounds(30, 260, 50, 20); fi.add(b);
 b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0)
 {
 fo = new Frame("Student Result");
fo.setSize(400, 400);
fo.setLayout(null);
fo.setVisible(true);
 fo.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
fo.dispose();
 }
 });
 Label lb = new Label("Result of " + tfn.getText());
lb.setBounds(10, 50, 200, 20);
 fo.add(lb); try { int m1 =
Integer.parseInt(tf1.getText()); int m2 =
Integer.parseInt(tf2.getText()); int m3 =
Integer.parseInt(tf3.getText()); int m4 =
Integer.parseInt(tf4.getText()); int m5 =
Integer.parseInt(tf5.getText()); Label lb1
= new Label("Marathi: " + m1);
lb1.setBounds(10, 80, 150, 20);
fo.add(lb1);
 Label lb2 = new Label("Hindi: " + m2);
lb2.setBounds(10, 110, 150, 20);
fo.add(lb2);
 Label lb3 = new Label("English: " + m3);
lb3.setBounds(10, 140, 150, 20);
fo.add(lb3);
 Label lb4 = new Label("Maths: " + m4);
lb4.setBounds(10, 170, 150, 20);
fo.add(lb4);
 Label lb5 = new Label("Science: " + m5);
lb5.setBounds(10, 200, 150, 20);
fo.add(lb5);
 int total = m1 + m2 + m3 + m4 + m5;
float per = (float) total / 5;
 Label t = new Label("Total marks: " + total);
 t.setBounds(10, 230, 150, 20);
fo.add(t);
 Label p = new Label("Percentage: " + per);
 p.setBounds(10, 260, 150, 20);
 fo.add(p);
 String str = per >= 35 ? "PASS" : "FAIL";
 Label gr = new Label("Result: " + str);
gr.setBounds(30, 290, 150, 20); fo.add(gr);
 }
 catch (NumberFormatException e)
 {
Label errorLabel = new Label("Invalid input. Please enter numeric values for marks.");
 errorLabel.setBounds(10, 320, 300, 20);
fo.add(errorLabel);
 }
 }
 });
 }

    public static void main(String[] args) {
        demo2 obj = new demo2();
    }
}
