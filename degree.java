import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class degree extends JFrame implements ActionListener
{
JTextField txt1 = new JTextField();
JTextField txt2 = new JTextField();
degree()
{
JLabel lbl1 = new JLabel("Fahrenheit");
JLabel lbl2 = new JLabel("Celsius");
JButton btn1 = new JButton("Click");
lbl1.setBounds(100,50,80,20);
lbl2.setBounds(100,80,80,20);
txt1.setBounds(200,50,80,20);
txt2.setBounds(200,80,80,20);
btn1.setBounds(170,110,80,40);
btn1.addActionListener(this);
add(lbl1);
add(lbl2);
add(btn1);
add(txt1);
add(txt2);
setSize(500,500);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
double ftemp, ctemp;
DecimalFormat formatter = new DecimalFormat("0.0");
ftemp = Double.parseDouble(txt1.getText());
ctemp = (5.0 / 9.0) * (ftemp - 32);
txt2.setText(formatter.format(ctemp));
}
public static void main(String[] args)
{
degree awt = new degree();
}
}