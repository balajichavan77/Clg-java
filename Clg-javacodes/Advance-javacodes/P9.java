import java.awt.*;
import java.util.*;
import java.awt.event.*;
class P9 extends Frame implements ActionListener
{
	Button b1=new Button("start");
	Label lb1=new Label("D & T");
	P9()
	{
		setSize(400,400);
		setTitle("Clock");
		setVisible(true);
		setLayout(new FlowLayout());
		add(lb1);add(b1);
		b1.addActionListener(this);
	}
	public static void main(String arg[])
	{
		new P9();
	}
	public void actionPerformed(ActionEvent we)
	{
		lb1.setText(""+new Date());
	}
}