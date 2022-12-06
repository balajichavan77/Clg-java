import java.awt.*;
import java.awt.event.*;
class P11 extends Frame implements ActionListener
{
	Label lb1=new Label("Enter a text");
	Label lb2=new Label("Copied text");
	Button b1=new Button("copy-paste");
	TextField tf1=new TextField(50);
	TextField tf2=new TextField(50);
	P11()
	{
		setSize(500,500);
		setTitle("Frame");
		setVisible(true);
		setLayout(new FlowLayout());
		b1.addActionListener(this);
		add(lb1);add(tf1);add(b1);add(lb2);add(tf2);
	}
	public static void main(String arg[])
	{
		new P11();
	}
	public void actionPerformed(ActionEvent we)
	{
		String s=tf1.getText();
		tf2.setText(s);
	}
}