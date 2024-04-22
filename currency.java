import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class currency extends JFrame implements ActionListener
{
JTextField txt1 = new JTextField();
JTextField txt2 = new JTextField();
currency()
{
JLabel lbl1 = new JLabel("DOLLAR");
JLabel lbl2 = new JLabel("RUPEE");
JButton btn1 = new JButton("CONVERT");
lbl1.setBounds(100,50,80,20);
lbl2.setBounds(100,80,80,20);
txt1.setBounds(200,50,80,20);
txt2.setBounds(200,80,80,20);
btn1.setBounds(170,110,90,40);
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
double dollar,rupee;
DecimalFormat formatter = new DecimalFormat("0.0");
dollar = Double.parseDouble(txt1.getText());
rupee=dollar*81.71;
txt2.setText(formatter.format(rupee));
}
public static void main(String[] args)
{
currency awt = new currency();
}
}